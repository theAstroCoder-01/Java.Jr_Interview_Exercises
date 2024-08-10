package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Java Program to reverse each word of a String
 * using Java 8 streams.
 * 
 */


public class App19 {
    public static void main(String[] args) {
        
        String inputString = "Hello this is a Java program";
        
        String[] words = inputString.split(" ");
        
        
        List<String> result = Arrays.stream(words)
                .map((word) ->
                    new StringBuilder(word).reverse().toString())
                .collect(Collectors.toList());
        
        
        System.out.println(result);
        
    }
}

