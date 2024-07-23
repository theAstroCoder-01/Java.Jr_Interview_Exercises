package Exercises;

//Java Program to find the Factorial of a Number using Recursion


import java.util.Scanner;

public class App02 {
	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for input
		System.out.println("Enter a non-negative integer: ");
		int number = input.nextInt();

		// Calculate the factorial using recursion
		int factorial = calculateFactorial(number);
		
		// Display the result
		System.out.println("Factorial of " + number + " is: " + factorial);
		
		input.close();
		
	}

	public static int calculateFactorial(int number) {
		if(number == 1) {
			return 1; // Base case
		
		} else {
			// 5 * 4 * 3 * 2 * 1 = 120;
			return number * calculateFactorial(number - 1);
		}	
	}	
}
