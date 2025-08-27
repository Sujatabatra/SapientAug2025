package com.sujata.training;

import java.util.Scanner;

import com.sujata.exception.InvalidAgeException;
import com.sujata.exception.NegativeAgeException;

public class AgeInputMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int age = 0;

		try {
			AgeInput ageInput = new AgeInput();

			System.out.println("Enter age to check wheather person is eligible for Voting or not :");
			age = scanner.nextInt();

			ageInput.setAge(age);
			System.out.println("Person is eligible for voting as his/her age is "+ageInput.getAge());
		} catch (InvalidAgeException invalidAgeException) {
			System.out.println("Person is not eligible for voting as his/her age is " + age);
		}
		catch(NegativeAgeException negativeAgeException) {
			System.out.println(negativeAgeException.getMessage());
		}

	}

}
