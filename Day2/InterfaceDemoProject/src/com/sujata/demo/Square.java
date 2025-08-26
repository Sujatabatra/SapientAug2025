package com.sujata.demo;

public class Square extends InputValue implements Shape, NonRoundedShape {

	public Square(int side) {
		setValue(side);
	}
	
	@Override
	public void perimeter() {
		System.out.println("Perimeter of Square "+4*getValue());

	}

	@Override
	public void area() {
		System.out.println("Area of Square : "+getValue()*getValue());

	}

}
