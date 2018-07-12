package com.company.txt2json;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {

		Integer[] a = {10, 12, -3, 43};
		List<Integer> b = new ArrayList<Integer>(Arrays.asList(a));
		b.forEach(System.out::println);
		System.out.println("++++++++++++");
		b.sort(Integer::compareTo);
		b.forEach(System.out::println);
	}

	public void run(String... args) throws Exception {

	}
}
