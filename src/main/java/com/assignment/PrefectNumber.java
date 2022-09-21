package com.assignment;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrefectNumber {
	private static final Logger logger = LogManager.getLogger(PrefectNumber.class);
	long n; 
	int sum = 0;
	Scanner sc = new Scanner(System.in);

	public void perfect() {
		logger.info("Enter the number: ");
		n = sc.nextLong();
		for (int i = 1; i <= n / 2; i++) {
			// executes until the condition becomes false
			if (n % i == 0) {
				// calculates the sum of factors
				sum = sum + i;
			}
		}
		// compares sum with the number and prints it if sum and n are equal
		if (sum == n) {
			logger.info(n + " is a perfect number.");
		} else
			// prints if sum and n are not equal
			logger.info(n + " is not a perfect number.");
	}
}

