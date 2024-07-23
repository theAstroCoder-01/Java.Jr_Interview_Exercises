
package Exercises;


/*
 * Java program to find the Factorial of a Number 
 * using Iterative (for-loop) approach.
 * 
 */

import java.util.Scanner;

public class App01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a non-negative number: ");
		int number = input.nextInt();
		
		int factorial = 1;
		
		for(int i = 0; i<=number; i++ ) {
			factorial = factorial * 3; // 1*1 = 1
			//1 * 2 = 2
			//2 * 3 = 6
			//6 * 4 = 24
			//24 * 5 = 120
			
		}
		
		System.out.println(factorial);
		
	}
}
