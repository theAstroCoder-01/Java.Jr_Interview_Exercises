package Exercises;

import java.util.Scanner;

// Java Program to Check if a Number is Even or Odd

/*
 * To check if a number is Even or Odd in Java, we can use the module operator %.
 * This operator returns the remainder of a division operation. 
 * 
 * If a number is divisible by 2 with no remainder, it is Even.
 * Otherwise, it is Odd.
 * 
 */

public class App05 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a number: ");
		int number = input.nextInt();
				
		// Check if the number is Even or Odd
		if(number % 2 == 0) {
			System.out.println(number + " is an Even number.");
		} else {
			System.out.println(number + " is an Odd number.");
			
		}
		
		input.close();
	}
}
