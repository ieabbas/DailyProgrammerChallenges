package challenge_009;

import java.io.*;

/**
 * This repository contains the challenges posted from the
 * DailyProgrammerChallenges GitHub repository that can be found at
 * https://github.com/FreddieV4/DailyProgrammerChallenges.
 * 
 * Challenge 009 : Write a program that will allow the user to input digits, and
 * arrange them in numerical order. For extra credit, have it also arrange
 * strings in alphabetical order
 * 
 * Solution provided by : Ismail A.
 * 
 * @author ieabbas
 */
public class Challenge_009 {

	// The logic here is that the Buffered reader will take in the input
	// After that the String array will split the input by whitespace
	// Finally the integer array will
	public static void main(String[] args) throws Exception {
		System.out.println("Please enter digits continuously, separated by space, ending by hitting enter.");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = reader.readLine().split(" ");
		int[] intArray = new int[input.length];

		// Parsing and assigning int values
		for (int i = 0; i < input.length; i++) {
			intArray[i] = Integer.parseInt(input[i]);
		}

		// Printing the values
		for (int i = 0; i < input.length; i++) {
			System.out.println("You entered the number(s) " + intArray[i] + " ");
		}

		/*
		 * // The process of taking input and assigning it to a char array int
		 * input = kb.nextInt(); int[] inputArray = new int[input];
		 * System.out.println(inputArray.length); for (int i = 0; i <
		 * inputArray.length; i++) { inputArray[i] = input; }
		 * 
		 * int output; for (int i = 0; i < inputArray.length; i++) { output = ('
		 * ' + (inputArray[i] - 64) + ' '); System.out.println(output); }
		 */
	}

}
