package Exercises;


// Write a Java Program to swap two numbers without using third variable

public class App11 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("a is " + a + " " + "and b is " + b);
		
		a = a + b; // a = 10 + 20
		b = a - b; // b = 10 - 20
		a = a - b; // a = 10 - 20
		
		System.out.println("After swapping, " + "a is " + a + " and b is " + b);
		
	}	
}
