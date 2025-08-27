package com.sujata.demo;

public class Derived extends BaseClass {

	@Override
	public void first() {
		System.out.println("Derived First");
	}
	
	static public void second() {
		System.out.println("Derived Second");
	}
}
