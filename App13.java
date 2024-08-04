package Exercises;


// Java Program to Remove all Whitespaces from a String

public class App13 {
	public static void main(String[] args) {
		
		String input = "OneSpace  TwoSpaces  ThreeSpaces  FourSpaces";
		
		String result = input.replaceAll("\\s+", "");
		
		System.out.println(result);
		
		
	}
}
