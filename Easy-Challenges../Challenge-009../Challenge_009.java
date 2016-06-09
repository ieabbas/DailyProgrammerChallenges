package challenge_009;

import java.util.*;

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

	// The logic here is that you will take the input as a String,
	// turn that into in an array of characters, then be able to
	// numerically order each position of the input

	// Maybe this should be an int array so output can more easily be sorted?
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter digits continuously, ending by hitting enter.");

		// The process of taking input and assigning it to a char array
		String input = kb.nextLine();
		char[] inputArray = new char[input.length()];
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = input.charAt(i);
		}

		int output;
		for (int i = 0; i < inputArray.length; i++) {
			output = (char) (' ' + (inputArray[i]));
			System.out.println(output);
		}
		System.exit(0);

	}

}
