package challenge_008;

/**
 * This repository contains the challenges posted from the
 * DailyProgrammerChallenges GitHub repository that can be found at
 * https://github.com/FreddieV4/DailyProgrammerChallenges.
 * 
 * Challenge 008 : Write a program that will print the song
 * "99 bottles of beer on the wall". For extra credit, do not allow the program
 * to print each loop on a new line.
 * 
 * Solution provided by : Ismail A.
 * 
 * @author ieabbas
 */
public class Challenge_008 {

	public static void main(String[] args) {
		String lyric1 = " bottles of beer on the wall,";
		String lyric2 = " bottles of beer,";
		String lyric3 = " take one down, pass it around,";
		String lyric4 = " bottles of beer on the wall!";

		String lyric5 = " bottle of beer on the wall,";
		String lyric6 = " bottle of beer,";
		String lyric7 = " take one down, pass it around,";
		String lyric8 = " bottle of beer on the wall!";

		int count = 100;

		for (int i = 0; i < 99; i++) {
			if (count > 2) {
				System.out.println((count - 1) + lyric1 + (count - 1) + lyric2 + lyric3 + (count - 1) + lyric4);
			}
			if (count == 2) {
				System.out.println((count - 1) + lyric5 + (count - 1) + lyric6 + lyric7 + (count - 1) + lyric8);
			}
			count--;
		}
	}

}
