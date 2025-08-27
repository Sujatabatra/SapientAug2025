package com.sujata.demo;

public class FirstClassDemo {

	private final int VALUE = 10;
	private final String NAME;

	public FirstClassDemo(String name) {
		super();
		NAME = name;
	}

	public void show() {
//		VALUE=8;
//		NAME="XYZ";
		System.out.println("Value : "+VALUE);
		System.out.println("Name : "+NAME);
	}
}
