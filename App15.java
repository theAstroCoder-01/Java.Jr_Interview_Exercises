package Exercises;

import java.util.Arrays;
import java.util.List;

// Java Program to print Even Numbers Using Java 8


public class App15 {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays
				.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
		
		numbers.stream()
			.filter((n) -> n % 2 == 0)
			.forEach((n) -> {
				System.out.println(n);
			});
		}
	}

