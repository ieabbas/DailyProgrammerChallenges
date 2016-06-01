package challenge_004;

import java.util.Random;

/**
 * This repository contains the challenges posted from the
 * DailyProgrammerChallenges GitHub repository that can be found at
 * https://github.com/FreddieV4/DailyProgrammerChallenges.
 * 
 * This class will act as the object creating the random passwords, being called
 * upon in the Challenge_004 class.
 * 
 * Solution provided by : Ismail A.
 */
public class PassGenerator {

	/*
	 * This variable will hold how many passwords the user wishes to generate
	 * from the object
	 */
	private int howManyPass;

	/*
	 * This variable will hold the length of each password the user wishes to
	 * generate from the object, keeping in mind that characters operate on a
	 * zero index counter
	 */
	private int passLength;

	/*
	 * This variable will be the representation of alphabet characters used to
	 * make up each password
	 */
	private final String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
			"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

	/*
	 * This variable will hold the final set of passwords to be printed after
	 * generated
	 */
	private String[] passwords;

	/*
	 * This variable will randomize the combination of letters to be used in
	 * each password
	 */
	private Random rand = new Random(26);

	/*
	 * This variable will append and create the {@link String}s to be printed
	 * for each password
	 */

	/*
	 * This is the default constructor for the {@link PassGenerator}. It will
	 * know the length of each password, as well as how many, from passed in
	 * parameters
	 * 
	 * @param howMany The number of passwords that will be associated with this
	 * object
	 * 
	 * @param length The length of each password that will be associated with
	 * this object, keeping in mind that characters operate on a zero index
	 * counter
	 */
	public PassGenerator(int howMany, int length) {
		howManyPass = howMany;
		passLength = length;
		passwords = new String[howManyPass];
	}

	/*
	 * This method will generate the passwords for the user. Each position of
	 * the {@param passwords} array will hold a password, and the method will
	 * append a new character to each position until it reaches the length
	 * specified for each password that the user desires.
	 */
	@SuppressWarnings("unused")
	public void generate() {
		// Keep track of the number of passwords created if you're using an
		// array of strings to hold each password
		int count = 0;

		// Set the length of the passwords
		int length = passLength;

		// Set the number of passwords to be created
		int numOfPass = howManyPass;

		for (int i = 0; i < numOfPass; i++) {
			passwords[i] = new String();
			for (int j = 0; j < length; j++) {
				passwords[i] = passwords[i].concat(alphabet[rand.nextInt(26)]);
			}
		}
	}

	/*
	 * This method will print out the passwords that have been generated. It
	 * ideally should print each on a separate line for the user to clearly
	 * dilineate what they have received.
	 */
	public void printPass() {
		for (int i = 0; i < howManyPass; i++) {
			System.out.println(passwords[i]);
		}
	}
}
