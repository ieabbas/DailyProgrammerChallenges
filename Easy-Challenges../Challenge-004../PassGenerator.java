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
	private final char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
			'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	
	/*
	 * This variable will randomize the combination of letters to be used in each password
	 */
	private Random rand = new Random(26);

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
	}

	/*
	 * This method will generate the passwords for the user
	 */
	public void generate() {
		// Set the length of the passwords
		int length = passLength;

		// Set the number of passwords to be created
		int numOfPass = howManyPass;
		
		
		
	}
}
