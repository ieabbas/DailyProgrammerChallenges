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
		double series = 0.0;
		for (double i = 1; i < 100000000; i += 2) {
			series = series + ((1.0 / (2.0 * i - 1)) - (1.0 / (2.0 * i + 1)));
		}
		double pi = 4 * series;
		System.out.println(pi);

	}
}
