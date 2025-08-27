package com.sujata.demo;

import java.util.Scanner;

public class FirstDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int location = 0;
		try {
			System.out.println("Enter First Number : ");
			int number1 = scanner.nextInt();
			System.out.println("Enter Second Number : ");
			int number2 = scanner.nextInt();

			int result = number1 / number2;
			System.out.println("Division Result : " + result);

			int arr[];
			System.out.println("Enter Total Number of elements : ");
			int total = scanner.nextInt();
			arr = new int[total];

			for (int index = 0; index < total; index++) {
				System.out.println("Enter element : ");
				arr[index] = scanner.nextInt();
			}
			System.out.println("Enter location in an array to get the value :");
			location = scanner.nextInt();
			System.out.println("Element at " + location + " in an array : " + arr[location]);
		} catch (ArithmeticException arithmeticException) {
			System.out.println("Undefined");
		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println(location + " does not exist in an array ");
		}

		catch (NegativeArraySizeException negativeArraySizeException) {
			System.out.println("Size of array can never be negative");
		} catch (Exception exception) {
			System.out.println("Something went wrong please try after sometime");
		}
		finally {
			System.out.println("Good Bye from finally");
		}
		System.out.println("Good Bye from Main!");

	}

}
