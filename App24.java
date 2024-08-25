package Exercises;

import java.util.Scanner;

/*
 * Java Program to find the largest number among three numbers
 * 
 */


public class App24 {
	public static void main(String[] args) {
		
		//Scanner object to read input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double number1 = input.nextDouble();
		System.out.println("Enter the second number: ");
		double number2 = input.nextDouble();
		System.out.println("Enter the third number: ");
		double number3 = input.nextDouble();
		
		//Determine the largest number
		double largest;
		
		if(number1 >= number2) {
			largest = number1;
		} else {
			largest = number3;
		}
		
		if(number2 >= number3) {
			largest = number2;
		} else { 
			largest = number3;
		}
		
		System.out.println(largest);
			
		input.close();
			
		}
	}


