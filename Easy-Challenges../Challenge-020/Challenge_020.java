package challenge_020;

import java.io.*;
import java.util.*;

/**
 * This repository contains the challenges posted from the
 * DailyProgrammerChallenges GitHub repository that can be found at
 * https://github.com/FreddieV4/DailyProgrammerChallenges.
 * 
 * Challenge 020 : Create a program that will find all prime numbers below 2000
 * 
 * Solution provided by: Ismail A.
 * 
 * @author ieabbas
 */

public class Challenge_020 {

	// TODO: FIX LOGIC. 189 IS NOT A PRIME NUMBER

	public static void main(String[] args) throws Exception {

		// Reference the wiki on "formula for primes" to get the basic
		// calculations
		System.out.println("This program will list out all prime numbers under 2000.");
		Thread.sleep(2500);

		// Set up variables
		Scanner kb = new Scanner(System.in);
		boolean isPrime;
		ArrayList<Integer> primeList = new ArrayList<>();
		primeList.add(2); // 2 is the first non "1" prime number

		// Begin the fun
		for (int i = 3; i < 2000; i += 2) { // skip even numbers my friend
			isPrime = true;
			for (Integer primeNum : primeList) {
				// If a number is not prime
				if (i % primeNum == 0) {
					break; // some boxing fights have better stoppages than this
				}
			}
			if (isPrime) {
				primeList.add(i);
			}
		}
		System.out.println(primeList.toString());
	}

}
