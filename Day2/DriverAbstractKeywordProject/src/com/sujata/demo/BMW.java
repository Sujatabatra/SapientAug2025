package com.sujata.demo;

public class BMW extends Car {

	public BMW(String model, String color) {
		super(model, color);
	}


	public void bmwEngine() {
		System.out.println("BMW engine goes BOOOOOM");
	}

	@Override
	public void engine() {
		bmwEngine();
		
	}
}
