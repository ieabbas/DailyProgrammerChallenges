package challenge_003;

/**
 * This repository contains the challenges posted from the
 * DailyProgrammerChallenges GitHub repository that can be found at
 * https://github.com/FreddieV4/DailyProgrammerChallenges.
 *
 * This class will act as the object performing the encryption and decryption of
 * any alphabetical text passed in.
 *
 * Solution provided by : Ismail A.
 */
public class CaeserCipher {

	/*
	 * This is the default constructor the the {@link CaeserCipher} class
	 */
	public CaeserCipher() {

	}

	/*
	 * This method will encrypt the text, and return an encrypted version
	 * 
	 * @param phrase Is the phrase to be encrypted by the method
	 * 
	 * @param encrypPhrase Is the encrypted version of the text passed in
	 */
	public String encString(String phrase, int shift) {
		char x;
		StringBuilder s = new StringBuilder();

		for (int i = 0; i < phrase.length(); i++) {
			// X becomes an encrypted version of the character at the position
			// in the phrase
			x = phrase.charAt(i);

			if (Character.isLowerCase(phrase.charAt(i)) && x > 'z'
					|| (Character.isUpperCase(phrase.charAt(i)) && x > 'Z')) {

				x = (char) (phrase.charAt(i) - (26 - shift));
			}
			// The StringBuilder will concatenate the characters
			s.append(x);
		}
		return s.toString();
	}

	public String decString(String phrase, int shift) {
		char x;
		StringBuilder s = new StringBuilder();

		for (int i = 0; i < phrase.length(); i++) {
			// X becomes an encrypted version of the character at the position
			// in the phrase
			x = phrase.charAt(i);

			if (Character.isLowerCase(phrase.charAt(i)) && x > 'z'
					|| (Character.isUpperCase(phrase.charAt(i)) && x > 'Z')) {
				x = (char) (phrase.charAt(i) - 20);
			}
			// The StringBuilder will concatenate the characters
			s.append(x);
		}
		return s.toString();
	}
}
