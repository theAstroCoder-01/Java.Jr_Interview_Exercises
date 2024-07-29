package Exercises;

import java.util.Scanner;

//Java Program to find the largest Among Three Numbers

public class App07 {
	public static void main(String[] args) {
		
		// Create a Scanner object to read input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double number1 = input.nextDouble();
		System.out.println("Enter the second number: ");
		double number2 = input.nextDouble();
		System.out.println("Enter the third number: ");
		double number3 = input.nextDouble();
		
		if(number1 >= number2 && number1 >= number3) {
			System.out.println("The largest number is: " + number1);
			
		} else if(number2 >= number1 && number2 >= number3) {
			System.out.println("The largest number is: " + number2);
			
		} else {
			System.out.println("The largest number is: "+ number3);
		}
		
		input.close();
		
	}
}
