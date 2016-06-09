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
		
		
		
		for (int i = 0; i < 99; i++) {
			int count = 99;
			System.out.println(count - i);
		}
	}

}
