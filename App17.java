package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Write a Java Program to erase duplicate elements 
 * from the List using Java 8 Streams.
 * 
 */

public class App17 {
	public static void main(String[] args) {
		
		List<Integer> listWithDuplicates = 
				Arrays.asList(1, 1, 2, 2, 3, 4, 4, 5, 6, 7, 7);
		
		List<Integer> result = listWithDuplicates.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(result);
		
	}
}



