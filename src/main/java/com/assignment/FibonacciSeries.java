package com.assignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FibonacciSeries {
	private static final Logger logger = LogManager.getLogger(FibonacciSeries.class);
	static int number1 = 0, number2 = 1, number3 = 0;

	static void printFibonacci(int count) {
		if (count > 0) {
			number3 = number1 + number2;
			number1 = number2;
			number2 = number3;
			logger.info(" " + number3);
			printFibonacci(count - 1);
		}
	}

	public static void main(String args[]) {
		int count = 10;
		logger.info(number1 + " " + number2);// printing 0 and 1
		printFibonacci(count - 2);               // n-2 because 2 numbers are already printed
	}

}
