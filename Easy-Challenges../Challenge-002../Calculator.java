package challenge_002;

import java.util.*;

/**
 * This package conatins the challenges posted from the
 * DailyProgrammerChallenges GitHub repository that can be found at
 * https://github.com/FreddieV4/DailyProgrammerChallenges.
 * 
 * This class will act as the calculator object, implementing basic methods such
 * as add(), subtract(), multiply(), divide(), as well as some intermediate
 * functions such as exponential powers and square rooting
 * 
 * As a side note, generics are used because casting every function is
 * impractical and very tricky to code.
 * 
 * Solution provided by : Ismail A.
 */
public class Calculator<T> {
	/*
	 * This variable will hold any numbers being used in a calculation. The
	 * calculator will not know how many numbers are going to be in a
	 * calculation, so an ArrayList is needed to maintain a relatively fast time
	 * complexity while being stil able to perform functions. For simplicity's
	 * sake, the class is coded with a two number operation approach, along with
	 * assuming integer values.
	 */
	@SuppressWarnings("unused")
	private ArrayList<Integer> listOfNumbers;

	/*
	 * The default constructor for the {@link Calculator}
	 */
	public Calculator() {
		listOfNumbers = new ArrayList<Integer>();
	}

	/*
	 * This method will add two integer values together, as a basic operation on
	 * a calculator.
	 * 
	 * @param n1 The first integer in the operation
	 * 
	 * @param n2 The second integer in the operation
	 * 
	 * @return The value of the two integers combined
	 */
	public int addNum(int n1, int n2) {
		return (n1 + n2);
	}

	/*
	 * This method will subtract two integer values, in this case it will be the
	 * first value having the second subtracted from it
	 * 
	 * @param n1 The first integer in the operation
	 * 
	 * @param n2 The second integer in the operation
	 * 
	 * @return The value of the first integer having the second subtracted from
	 * it
	 */
	public int subtractNum(int n1, int n2) {
		return (n1 - n2);
	}

	/*
	 * This method will multiply two integer values, as a basic operation on a
	 * calculator.
	 * 
	 * @param n1 The first integer in the operation
	 * 
	 * @param n2 The second integer in the operation
	 * 
	 * @return The value of the first integer multiplied by the second integer
	 */
	public int multiplyNum(int n1, int n2) {
		return (n1 * n2);
	}

	/*
	 * This method will divide two integer values, as a basic operation on a
	 * calculator. Integer division as defined by java will handle floor/ceiling
	 * conversions.
	 * 
	 * @param n1 The first integer in the operation
	 * 
	 * @param n2 The second integer in the operation
	 * 
	 * @return The value of the first integer divided by the second integer
	 */
	public int divideNum(int n1, int n2) {
		return (n1 / n2);
	}

}
