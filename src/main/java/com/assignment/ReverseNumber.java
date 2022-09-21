package com.assignment;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReverseNumber {
	private static final Logger logger = LogManager.getLogger(App.class);

	int number;
	int reverse = 0;
	int remainder;
	Scanner sc = new Scanner(System.in);

	public void reverseNum() {
		logger.info("Enter a number");
		number = sc.nextInt();
		while (number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		logger.info("The reverse of the given number is: " + reverse);
	}

}
