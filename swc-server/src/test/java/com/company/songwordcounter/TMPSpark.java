package com.company.songwordcounter;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.SparkSession;
import scala.Tuple2;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class TMPSpark {
	private static final Pattern SPACE = Pattern.compile(" ");

	public static void main(String[] args) throws Exception {
		SparkSession spark = SparkSession
				.builder()
				.appName("JavaWordCount")
				.master("local")
				.getOrCreate();

		JavaRDD<String> korn = spark.read().textFile("database/texts/korn/*.txt").javaRDD();

		JavaRDD<String> mm = spark.read().textFile("database/texts/marilyn_manson/*.txt").javaRDD();

		JavaRDD<String> words = korn.flatMap(s -> Arrays.asList(SPACE.split(s)).iterator());

		JavaRDD<String> words3 = mm.flatMap(s -> Arrays.asList(SPACE.split(s)).iterator());



		System.out.println("==========================");
		JavaPairRDD<String, Integer> ones = words.mapToPair(s -> new Tuple2<>(s, 1));

		JavaPairRDD<String, Integer> counts = ones.reduceByKey((i1, i2) -> i1 + i2);
		System.out.println("==========================");
		List<Tuple2<String, Integer>> output = counts.collect();
		output.forEach(System.out::println);
		System.out.println("==========================");
		spark.stop();
	}
}
