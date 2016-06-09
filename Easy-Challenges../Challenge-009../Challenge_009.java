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

	// The logic here is that the Buffered reader will take in the input.
	// After that the String array will split the input by whitespace.
	// Finally the integer array will take the raw values to be sorted and
	// printed later.
	public static void main(String[] args) throws Exception {
		System.out.println("Please enter digits continuously, separated by a single space, ending by hitting enter.");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = reader.readLine().split(" ");
		int[] intArray = new int[input.length];
		int[] outputArray = new int[intArray.length];

		// Parsing and assigning int values
		for (int i = 0; i < input.length; i++) {
			intArray[i] = Integer.parseInt(input[i]);
		}

		// Printing the values for confirmation
		for (int i = 0; i < input.length; i++) {
			System.out.println("You entered the number(s) " + intArray[i] + " ");
		}

		// Sorting the values
		outputArray = radixSort(intArray, 1);

		// Printing the sorted values
		System.out.print("\nYour sorted values are\n");
		for (int i : outputArray) {
			System.out.println(i);
		}

	}

	/*
	 * The following methods and auxiliary methods are pulled from previous
	 * academic assignments on sorting algorithms. All rights are reserved to
	 * Professor Edwin Rodriguez of Cal Poly Pomona.
	 */
	public static int[] radixSort(int[] numbers, int radix) {
		int[] result = numbers;

		for (int pos = 1; pos <= radix; ++pos) {
			result = modCountingSort(result, pos);
		}

		return result;
	}

	public static int[] modCountingSort(int[] numbers, int pos) {
		int[] counter = new int[10];
		int[] result = new int[numbers.length];

		for (int i = 0; i < numbers.length; ++i) {
			++counter[getDigit(numbers[i], pos)];
		}

		for (int i = 1; i < counter.length; ++i) {
			counter[i] += counter[i - 1];
		}

		for (int i = result.length - 1; i >= 0; --i) {
			result[--counter[getDigit(numbers[i], pos)]] = numbers[i];
		}

		return result;
	}

	private static int getDigit(int number, int pos) {
		int pow = (int) Math.pow(10, pos);
		int rem = number % pow;
		return rem / (pow / 10);
	}

}
