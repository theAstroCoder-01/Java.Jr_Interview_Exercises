package Exercises;

import java.util.Scanner;

// Write a Java Program to Find the Largest Among Three Numbers Using In-Built Function


public class App08 {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double number1 = input.nextDouble();
		System.out.println("Enter the second number: ");
		double number2 = input.nextDouble();
		System.out.println("Enter the third number: ");
		double number3 = input.nextDouble();
		
		//Determine the largest number using Math.max
		double result = Math.max(number1, Math.max(number2, number3));
		
		System.out.println(result);
		
		input.close();
				
	}
}
