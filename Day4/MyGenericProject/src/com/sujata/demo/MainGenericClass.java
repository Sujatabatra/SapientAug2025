package com.sujata.demo;

public class MainGenericClass {

	public static void main(String[] args) {

		/*
		 * Compiler create a class internally by replacing T with the Object, we are
		 * specifying
		 */
		GenericInput<Integer> intInput = new GenericInput<>();

		intInput.setValue(10);

		System.out.println(intInput.getValue());

		GenericInput<String> stringInput=new GenericInput<String>();
		
		stringInput.setValue("Sujata");
		System.out.println(stringInput.getValue());
		
		GenericInput<Person> perInput=new GenericInput<Person>();
		perInput.setValue(new Person(null, null));
		
		
		System.out.println(perInput.getValue().getName());
		
	}

}
