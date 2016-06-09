package challenge_006;

/**
 * This repository contains the challenges posted from the
 * DailyProgrammerChallenges GitHub repository that can be found at
 * https://github.com/FreddieV4/DailyProgrammerChallenges.
 * 
 * Challenge 006 : You're challenge for today is to create a program that can
 * calculate pi accurately to at least 30 decimal places. Try not to cheat :)
 * 
 * Solution provided by : Ismail A.
 * 
 * @author ieabbas
 */
public class Challenge_006 {

	public static void main(String[] args) {
		System.out.println("Here is Pi, calculated to at least 30 decimal places:\n");
		char pi = '3';

		for (int i = 3; i < 30; i++) {
			int n1 = i + 1;
			pi = (char) (pi + ((char)n1));
		}
		System.out.println(pi);
		System.out.println(Math.PI);

	}
}
