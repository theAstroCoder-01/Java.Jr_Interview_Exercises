package Exercises;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * How do you find frequency of each character 
 * in a String using Java 8 Streams
 * 
 */


	public class App22 {
	    public static void main(String[] args) {
	        
	    	String input = "Java Exercises";

	        IntStream stream = input.chars();
	        Stream<Character> characterStream = stream.mapToObj(c -> (char) c);

	        Map<Character, Long> map = characterStream
	                .collect(Collectors.groupingBy(
	                        Function.identity(),
	                        Collectors.counting()
	                ));

	        System.out.println(map);
	    
	    }
	}
