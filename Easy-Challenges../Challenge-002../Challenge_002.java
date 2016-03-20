package challenge_002;

import java.util.*;

/**
 * This repository contains the challenges posted from the
 * DailyProgrammerChallenges GitHub repository that can be found at
 * https://github.com/FreddieV4/DailyProgrammerChallenges.
 * 
 * Challenge 002 : Hello, coders! An important part of programming is being able
 * to apply your programs, so your challenge for today is to create a calculator
 * application that has use in your life. It might be an interest calculator, or
 * it might be something that you can use in the classroom. For example, if you
 * were in physics class, you might want to make a F = M * A calc. Extra credit
 * : allow the calculator to have multiple functions!
 * 
 * Solution provided by : Ismail A.
 */
public class Challenge_002 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// Variables needed for calculation
		Calculator calc = new Calculator();
		Scanner kb = new Scanner(System.in);
		int n1;
		int n2;
		int choice;

		do {
			System.out.println("Enter the two numbers you wish to perform operations upon:");
			n1 = kb.nextInt();
			n2 = kb.nextInt();

			System.out.println(
					"Select the operation you wish to perform. Type and enter a capital \"D\" to stop: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");

			choice = kb.nextInt();
			switch (choice) {
			case 1:
				System.out.println("\nThe answer is " + calc.addNum(n1, n2) + "\n");
				break;
			case 2:
				System.out.println("\nThe answer is " + calc.subtractNum(n1, n2) + "\n");
				break;
			case 3:
				System.out.println("\nThe answer is " + calc.multiplyNum(n1, n2) + "\n");
				break;
			case 4:
				System.out.println("\nThe answer is " + calc.divideNum(n1, n2) + "\n");
				break;
			default:
				System.out.println("\n" + choice + " isn't an operation" + "\n");
			}
		} while (n1 != 0 && n2 != 0);
		kb.close();
	}

}
