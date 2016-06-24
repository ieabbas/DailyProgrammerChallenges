package challenge_014;

import java.io.*;
import java.util.Scanner;

/**
 * This repository contains the challenges posted from the
 * DailyProgrammerChallenges GitHub repository that can be found at
 * https://github.com/FreddieV4/DailyProgrammerChallenges.
 * 
 * Challenge 014 : Input: list of elements and a block size k or some other
 * variable of your choice
 * 
 * Output: return the list of elements with every block of k elements reversed,
 * starting from the beginning of the list.
 *
 * For instance, given the list 12, 24, 32, 44, 55, 66 and the block size 2, the
 * result is 24, 12, 44, 32, 66, 55.
 * 
 * Solution provided by: Ismail A.
 * 
 * @author ieabbas
 */
public class Challenge_014 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		int k;
		String[] input;
		Scanner kb = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Parse the input for strings, place them into an array
		System.out.print("Enter a list of elements, each element separated by a space:");
		input = reader.readLine().split(" ");

		for (String i : input) {
			System.out.print(i + " ");
		}

		System.out.println("Enter size k elements to be reversed: ");
		k = kb.nextInt();

		kb.close();
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

}
