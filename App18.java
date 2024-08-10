package Exercises;

import java.time.LocalDate;
import java.time.Period;

/*
 * Java Program to find the age of a person in years 
 * if the birthday year is given.
 * 
 */


public class App18 {
	public static void main(String[] args) {
		LocalDate birthDate = LocalDate.parse("1989-12-25");
		
		LocalDate currentDate = LocalDate.now();
		
		Period period = Period.between(birthDate, currentDate);
		
		System.out.println(period.getYears());
		
	}
}
