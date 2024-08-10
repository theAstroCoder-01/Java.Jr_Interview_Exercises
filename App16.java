package Exercises;

import java.util.Arrays;
import java.util.List;

/*
 * Write a Java Program to retrieve the last element 
 * of a list of Strings using Java 8's Stream API
 * 
 */

public class App16 {
	public static void main(String[] args) {
		
	//Create and initialize a list of Strings	
	List<String> listOfStrings = Arrays
			.asList("One", "Two", "Three", "Four", "Five");	
		
	String result = listOfStrings.stream()
		.skip(listOfStrings.size() - 1)
		.findFirst()
		.get(); 
	
	System.out.println(result);
		
	}
}
