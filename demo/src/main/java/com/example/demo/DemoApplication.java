package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch=new BinarySearchImpl(new QuickSortAlgorithm());
		int result=binarySearch.binaySearch(new int[] {2,3,4},3);
		System.out.println(result);
		//SpringApplication.run(DemoApplication.class, args);
	}

}
