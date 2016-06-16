package challenge_012;

/**
 * This repository contains the challenges posted from the
 * DailyProgrammerChallenges GitHub repository that can be found at
 * https://github.com/FreddieV4/DailyProgrammerChallenges.
 * 
 * Challenge 012 : Write a program that will take a string and print out all
 * variations of that string.
 * 
 * Solution provided by : Ismail A.
 * 
 * Credits to algorithm:
 * http://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a
 * -given-string/
 * 
 * @author ieabbas
 */
public class Challenge_012 {

	public static void main(String[] args) {
		String input = "random";
		int length = input.length();
		alter(input, 0, length - 1);
	}

	/*
	 * This method will swap values using the standard temp variable switch
	 */
	public static void swap(int i, int j) {
		char temp;
		temp = (char) i;
		i = j;
		j = temp;
	}

	/*
	 * This method will permute the string in every possible combination. It
	 * takes in 3 parameters; (1) the string, (2) the starting index of the
	 * string, and (3) the ending index of the string
	 */
	public static void alter(String input, int start, int end) {
		int i;
		if (start == end) {
			System.out.println(input);
		} else {
			for (i = start; i <= end; i++) {
				swap((input.charAt(i) + start), (input.charAt(i) + i));
				alter(input, (start + start), end);
				swap((input.charAt(i) + start), (input.charAt(i) + i));
			}
		}
	}
}
