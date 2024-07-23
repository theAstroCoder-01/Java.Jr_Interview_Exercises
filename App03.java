package Exercises;

//Java Program to Display Fibonacci Series.

/*
* The Fibonacci series is a sequence where each number is the sum
* of the two preceding ones, usually starting with 0 and 1.
*/


import java.util.Scanner;

public class App03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input the number of terms in the Fibonacci series: ");
		int number = input.nextInt();
				
		
		int firstTerm = 0;
		int secondTerm = 1;
		
		
		for(int i = 0; i <= number; i++) {
			System.out.println(firstTerm + " ");
			
			// Compute the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			
		}
	}
}
