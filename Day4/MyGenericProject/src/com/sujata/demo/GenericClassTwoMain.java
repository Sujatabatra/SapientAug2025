package com.sujata.demo;

public class GenericClassTwoMain {

	public static void main(String[] args) {
		GenericClassTwo<Integer> genericInput1=new GenericClassTwo<Integer>();
		genericInput1.setValue(10);
		genericInput1.sum();

		GenericClassTwo<Double> genericInput2=new GenericClassTwo<>();
		genericInput2.setValue(10.4);
		genericInput2.sum();
		
//		GenericClassTwo<String> genericClassTwo=new GenericClassTwo<String>();

	}

}
