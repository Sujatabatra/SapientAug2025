package com.sujata.demo;

/*
 * 1. Decide Data
 * 2. Accessibility of data to outside world
 * 2.1 if Readable data, create getter
 * 2.2 if modifiable data, creater setter
 */
public class Factorial {

	private int number,factorial;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		calculate();
		return factorial;
	}


	private void calculate() {
		factorial=1;
		while(number>=1) {
			factorial*=number--;
		}
	}
	
}
