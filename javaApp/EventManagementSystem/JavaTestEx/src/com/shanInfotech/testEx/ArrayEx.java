package com.shanInfotech.testEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayEx {
	private static String str[]=null;
	private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void arrayTest() throws NumberFormatException, IOException {
		try {
		str=new String[Integer.parseInt(br.readLine())];
		for(int i=0;i<str.length;i++) {
			str[i]=br.readLine();
		}
		System.out.println("Enter the character to find");
		
		String input = br.readLine(); // Read input as String

		// Validate the input
        if (input.length() != 1 || Character.isDigit(input.charAt(0))) {
            throw new IllegalArgumentException("Input must be a single non-digit character.");
        }

        char ch = input.charAt(0);

		System.out.println("Strings containing the character '" + ch + "':");
			Arrays.stream(str).forEach(str -> {
                try {
                    if (str.chars().anyMatch(ch1 -> ch1 == ch)) {
                        System.out.println(str);
                    }
                } catch (Exception e) {
                    System.out.println("Error processing string: " + str + ", Error: " + e.getMessage());
                }
            });
			
	} catch (NumberFormatException e) {
        System.out.println("Error: Please enter a valid number for the number of strings.");
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    } catch (IOException e) {
        System.out.println("An I/O error occurred: " + e.getMessage());
    }
		}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		arrayTest();
	}
}