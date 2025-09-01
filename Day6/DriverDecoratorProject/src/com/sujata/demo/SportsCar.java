package com.sujata.demo;

public class SportsCar extends Car {

	private Car car;

	public SportsCar(Car car) {
		super();
		this.car = car;
	}
	
	public void sportsEngine() {
		System.out.print("V8 Turbo Engine  ");
		car.engine();
	}
}
