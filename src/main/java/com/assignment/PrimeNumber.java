package com.assignment;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrimeNumber {
	private static final Logger logger = LogManager.getLogger(PrimeNumber.class);
	int n;
	boolean flag;
	Scanner sc = new Scanner(System.in);

	public void prime() {
		logger.info("Enter number");
		n = sc.nextInt();
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			logger.info(n + " is not a prime number.");
		} else {
			logger.info(n + " is a prime number.");
			System.exit(0);
		}

	}

	public static void main(String args[]) {
		PrimeNumber primeObj = new PrimeNumber();
		primeObj.prime();
	}
}