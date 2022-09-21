package com.assignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FibonacciSeries {
	private static final Logger logger = LogManager.getLogger(FibonacciSeries.class);
	 int number1 = 0, number2 = 1, number3 = 0, count = 10;;

	public void printFibonacci() {
		logger.info(number1 + " " + number2);           // print 0 and 1 initial element
		while ((count-2) > 0) {
			number3 = number1 + number2;
			number1 = number2;
			number2 = number3;
			logger.info(" " + number3);
			count--;
		}
	}

}
