package com.sujata.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondDemo {

	static void divide(int number1, int number2) {
		try {
		int result = number1 / number2;
		System.out.println("Division Result : " + result);
		System.out.println("Good Bye from try");
		return;
		}
		finally {
			System.out.println("Good Bye from finally");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Enter First Number : ");
		int number1 = scanner.nextInt();
		System.out.println("Enter Second Number : ");
		int number2 = scanner.nextInt();
		divide(number1, number2);
		}
		catch(ArithmeticException arithmeticException) {
			System.out.println("Undefined");
		}
		catch(InputMismatchException inputMismatchException) {
			System.out.println("Kindly enter integer in mumber");
		}
		System.out.println("Good bye from main");

	}

}
