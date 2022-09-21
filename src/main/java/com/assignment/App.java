package com.assignment;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		logger.info("Hello World!");
		logger.info("Which program you want to run");
		logger.info("1.Fibonacci Series");
		logger.info("2.Prefect Number");
		logger.info("3.Prime Number");
		String choice = scanner.nextLine();
		switch (choice) {
		case "1":
			FibonacciSeries series = new FibonacciSeries();
			series.printFibonacci();
		case "2":
			PrefectNumber perfectObj = new PrefectNumber();
			perfectObj.perfect();
			break;
		case "3":
			PrimeNumber primeObj = new PrimeNumber();
			primeObj.prime();
			break;
		}
		
		
	}
}
