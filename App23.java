package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Java Program to Start a List of Strings Alphabetically
 * using Java 8 Stream API
 * 
 */

public class App23 {
	public static void main(String[] args) {
		
		List<String> words = Arrays
				.asList("Banana", "Apple", "Mango", "Kiwi", "Orange");
		
		List<String> result = words.stream()
			.sorted()
			.collect(Collectors.toList());
		
		System.out.println(result);
		
	}
}
