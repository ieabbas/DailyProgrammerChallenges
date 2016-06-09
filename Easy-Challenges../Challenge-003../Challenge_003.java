package challenge_003;

import java.util.*;
/**
 * This repository contains the challenges posted from the
 * DailyProgrammerChallenges GitHub repository that can be found at
 * https://github.com/FreddieV4/DailyProgrammerChallenges.
 * 
 * Challenge 002 : Write a program that can encrypt texts with an alphabetical
 * caesar cipher. This cipher can ignore numbers, symbols, and whitespace. For
 * extra credit, add a "decrypt" function to your program!
 * 
 * Solution provided by : Ismail A.
 */
public class Challenge_003 {

	public static void main(String[] args) {
		CaeserCipher NSA = new CaeserCipher();
		Scanner kb = new Scanner(System.in);
		String input;

		System.out.println("Enter text you wish to encrypt:\n");
		input = kb.nextLine();
		System.out.println(NSA.encString(input, 5));
		
		System.out.println("Enter text you wish to decrypt:\n");
		input = kb.nextLine();
		System.out.println(NSA.decString(input, 2));
		
		
		kb.close();
	}

}
