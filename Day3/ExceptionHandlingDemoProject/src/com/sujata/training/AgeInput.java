package com.sujata.training;

import com.sujata.exception.InvalidAgeException;
import com.sujata.exception.NegativeAgeException;

public class AgeInput {

	private int age;
	
	public AgeInput() {
		
	}

	public AgeInput(int age)throws InvalidAgeException {
		if(age<=0)
			throw new NegativeAgeException("Age must be Positive ");
		else if(age<18)
			throw new InvalidAgeException("Age cannot be below 18");
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age)throws InvalidAgeException {
		if(age<=0)
			throw new NegativeAgeException("Age must be Positive ");
		else if(age<18)
			throw new InvalidAgeException("Age cannot be below 18");
		this.age = age;
	}
	
	
}
