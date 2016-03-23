package challenge_004;

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
	@SuppressWarnings("unused")
	private int howManyPass;

	/*
	 * This variable will hold the length of each password the user wishes to
	 * generate from the object, keeping in mind that characters operate on a
	 * zero index counter
	 */
	@SuppressWarnings("unused")
	private int passLength;

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
		
	}
}
