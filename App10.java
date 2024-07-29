package Exercises;


/*
 * Write a Java Program to reverse a String without Using
 * in-built reverse() method.
 * 
 */

public class App10 {
	public static void main(String[] args) {
		
		String input = "This is a Java Program"; //11
		
		String result = "";
		
		
		for(int i = input.length() - 1; i >= 0; i--) {
			result = result + input.charAt(i);
		} 
		
		System.out.println(result);
		
	}
}
