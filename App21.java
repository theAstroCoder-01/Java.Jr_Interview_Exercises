package Exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//In a given list find max number and minimum number using Java 8 Streams

public class App21 {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays
				.asList(10, 30, 40, 100, 120, 90, 80);
		
		int max = numbers.stream()
				.max(Comparator.naturalOrder())
				.get();
				
				System.out.println(max);
		
		int min = numbers.stream()
				.min(Comparator.naturalOrder())
				.get();
		
				System.out.println(min);		
		
	}
}
