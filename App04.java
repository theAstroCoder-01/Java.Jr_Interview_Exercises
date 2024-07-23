package Exercises;

import java.util.Scanner;

// Java Program to Check Whether a Number is Positive or Negative.

public class App04 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 
		System.out.println("Enter a number: ");
		double number = input.nextDouble();
		
		// Check if the number is positive, negative, or zero.
		if(number > 0) {
			System.out.println("Number is positive.");
		} else if(number < 0) {
			System.out.println("Number is negative.");
		} else {
			System.out.println("Number is 0.");
		}
		
		input.close();
		
	}
}

