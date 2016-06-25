package challenge_010;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * This repository contains the challenges posted from the
 * DailyProgrammerChallenges GitHub repository that can be found at
 * https://github.com/FreddieV4/DailyProgrammerChallenges.
 * 
 * Challenge 010 : The exercise today asks you to validate a telephone number,
 * as if written on an input form. Telephone numbers can be written as ten
 * digits, or with dashes, spaces, or dots between the three segments, or with
 * the area code parenthesized; both the area code and any white space between
 * segments are optional. Thus, all of the following are valid telephone
 * numbers: 1234567890, 123-456-7890, 123.456.7890, (123)456-7890, (123)
 * 456-7890 (note the white space following the area code), and 456-7890.
 * 
 * The following are not valid telephone numbers: 123-45-6789, 123:4567890, and
 * 123/456-7890.
 * 
 * source: programmingpraxis.com
 * 
 * Solution provided by : Ismail A.
 * 
 * @author ieabbas
 */
public class Challenge_010 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner kb = new Scanner(System.in);
		String input;

		do {
			System.out.println("Please enter a phone number to be validated.");
			input = kb.nextLine();

			// Check for the invalid conditions first, then everything else
			// should
			// be valid right?
			if (validLength(input) == false || validSymbolNum(input) == false) {
				System.out.println("This is not a valid number");
			} else {
				System.out.println("This is a valid number.");
			}
		} while (true);

	}

	/*
	 * This method will check if there is a minimum number of 8 characters
	 * (shortest combination of just numbers), or maximum number of 14
	 * characters (numbers+symbols) in the entered phone number. It will return
	 * true if it is valid, and false if otherwise.
	 */
	public static boolean validLength(String input) {
		if (input.length() > 14 || input.length() < 8) {
			return false;
		} else {
			return true;
		}
	}

	/*
	 * This method will check if there is an appropriate number of integer
	 * values within the input
	 */
	public static boolean validIntNum(String input) {
		return true;
	}

	/*
	 * This method will check if the entered phone number has an incorrect
	 * amount of symbols. It will return true if the expression satisfies these
	 * parameters, and false if otherwise.
	 */
	public static boolean validSymbolNum(String input) {
		int[] symbolNum = { 0, 0, 0 };
		char[] symbols = { '-', '.' };

		// Check each character of the input against each position of the
		// symbols array
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < symbols.length; j++) {
				if (input.charAt(i) == symbols[j]) {
					symbolNum[j]++;
				}
			}
		}

		// A phone number can have a max of 2 hyphens, and 3 periods
		if (symbolNum[0] > 2) {
			return false;
		} else if (symbolNum[1] > 3) {
			return false;
		} else {
			return true;
		}

	}

}
