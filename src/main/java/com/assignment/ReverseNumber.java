package com.assignment;

public class ReverseNumber {
	public static void main(String[] args) {
		int number = 546;
		int reverse = 0;
		int remainder;

		while (number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}

}
