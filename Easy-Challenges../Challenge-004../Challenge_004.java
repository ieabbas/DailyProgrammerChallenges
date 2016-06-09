package challenge_004;

import java.util.*;
/**
 * This repository contains the challenges posted from the
 * DailyProgrammerChallenges GitHub repository that can be found at
 * https://github.com/FreddieV4/DailyProgrammerChallenges.
 * 
 * Challenge 004 : Your challenge for today is to create a random password
 * generator! For extra credit, allow the user to specify the amount of
 * passwords to generate. For even more extra credit, allow the user to specify
 * the length of the strings he wants to generate!
 * 
 * Solution provided by : Ismail A.
 */
public class Challenge_004 {

	public static void main(String[] args) throws Exception {
		// Initialize the basics necessary
		Scanner kb = new Scanner(System.in);
		int howManyPass;
		int passLength;

		// Welcome the user
		System.out.println("Welcome to the most convenient program you've ever ran!\n");

		// Give the user some awkward moments to figure out why nothing has
		// happened yet
		Thread.sleep(2500);

		do {
			// Ask the user for how many passwords they wish to generate
			System.out.println("How many passwords would you like to generate?\n(Valid input are integers above 0)");
			howManyPass = kb.nextInt();
		} while (howManyPass <= 0);

		do {
			// Ask the user for how long each password should be
			System.out.println("How many characters should be in each password?\n(Valid input are integers above 0)");
			passLength = kb.nextInt();
		} while (passLength < 0);

		// This is the part where the passwords are created
		System.out.println("The passwords you have created are as follows:\n");

		// Remember: necessary to initialize generator here since the
		// length/amount of passwords is unknown until this point
		PassGenerator pass = new PassGenerator(howManyPass, passLength);
		pass.generate();
		pass.printPass();

		kb.close();
	}
}
