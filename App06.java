package Exercises;


// Java Program to Find the Largest Number in an Array.

public class App06 {
	public static void main(String[] args) {
		
		int[] numbers = {2, 4, 6, 8, 10};
		
		// Assume that the first element is the largest element to start.
		int largest = numbers[0];
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		
		// Display the largest element.
		System.out.println("The largest element in the array is " + largest);
		
	}
}
