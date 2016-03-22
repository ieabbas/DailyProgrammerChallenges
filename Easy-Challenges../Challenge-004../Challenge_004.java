package challenge_004;

import java.util.*;

/**
 * This repository contains the challenges posted from the
 * DailyProgrammerChallenges GitHub repository that can be found at
 * https://github.com/FreddieV4/DailyProgrammerChallenges.
 * 
 * Challenge 004 : Your challenge for today is to create a random password
 * generator!For extra credit, allow the user to specify the amount of passwords
 * to generate. For even more extra credit, allow the user to specify the length
 * of the strings he wants to generate!
 * 
 * Solution provided by : Ismail A.
 */
public class Challenge_004 {

	public static void main(String[] args) throws Exception {
		// Initialize the basics necessary
		Scanner kb = new Scanner(System.in);
		int howManyPass;

		// Welcome the user
		System.out.println("Welcome to the most convenient program you've ever ran!\n");

		// Give the user some awkward moments to figure out why nothing has
		// happened yet
		Thread.sleep(5000);

		do {
			// Ask the user for how many passwords they wish to generate
			System.out.println("How many passwords would you like to generate?\n(Valid input such that input < 0)");
			howManyPass = kb.nextInt();
		} while (howManyPass <= 0);

		kb.close();
	}
}
