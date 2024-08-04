package Exercises;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// Java Program to Remove Duplicate Elements from ArrayList

public class App12 {
	public static void main(String[] args) {
		
		List<Integer> listWithDuplicates = new ArrayList<>();
		
		listWithDuplicates.add(1);
		listWithDuplicates.add(2);
		listWithDuplicates.add(2);
		listWithDuplicates.add(3);
		listWithDuplicates.add(3);
		listWithDuplicates.add(4);

		Set<Integer> setWithoutDuplicates = new LinkedHashSet<>(listWithDuplicates);
		
		List<Integer> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);
		
		System.out.println(listWithoutDuplicates);
		
	}
}
