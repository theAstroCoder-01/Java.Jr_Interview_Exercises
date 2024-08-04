package Exercises;

import java.util.stream.IntStream;

// Java Program to Find the Sum of All Digits of a Number Using Java 8

public class App14 {
	public static void main(String[] args) {
		
		int number = 12345; // 15
		
		IntStream stream = String.valueOf(number)
			.chars();
		
		int sum = stream.map(Character::getNumericValue)
				.sum();
		
		System.out.println(sum);
		
	}
}
