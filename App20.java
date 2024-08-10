package Exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Java Program to find the Second Largest Number 
 * in List of Integers. 
 * 
 */

public class App20 {
	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays
				.asList(12, 45, 34, 76, 39, 73, 62);
		
		Integer result = listOfIntegers.stream()
			.sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst()
			.get();
			
		System.out.println(result);
		
	}
}
