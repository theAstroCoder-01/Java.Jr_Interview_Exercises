package Exercises;

import java.util.Scanner;

// Write a Java Program to Check Whether an Alphabet is Vowel or Consonant

public class App09 {
	public static void main(String[] args) {
	
		// Create a Scanner object to read input
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for input
		System.out.println("Enter a single alphabet: ");
		char alphabet = input.next().charAt(0);
		
		// Check for vowel or consonant
		boolean isVowel = false;
		
		if(alphabet == 'a' || alphabet == 'A' ||
			alphabet == 'e' || alphabet == 'E' ||
			alphabet == 'i' || alphabet == 'I' ||
			alphabet == 'o' || alphabet == 'O' ||
			alphabet == 'u' || alphabet == 'U') {
			
			isVowel = true;
				
		}
		
		if(isVowel) {
			System.out.println(alphabet + " is a vowel.");
		} else {
			System.out.println(alphabet + " is a consonant.");
		}
			
		input.close();
	}
}
