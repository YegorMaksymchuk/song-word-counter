package com.company.songwordcounter.spark;

import org.apache.spark.sql.SparkSession;

public class SparkConfig {

	public static synchronized SparkSession sparkSessionFactory(String appName, String masterUrl) {
		return SparkSession
				.builder()
				.appName(appName)
				.master(masterUrl)
				.getOrCreate();
	}

	public static synchronized SparkSession sparkSessionFactoryLocal(String appName) {
		return SparkSession
				.builder()
				.appName(appName)
				.master("local")
				.getOrCreate();
	}
}
