package com.assignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("Hello World!");
		FibonacciSeries series=new FibonacciSeries();
			series.printFibonacci();               // n-2 because 2 numbers are already printed
	}
}
