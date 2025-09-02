package com.sujata.demo;

public class Circle extends Shape implements Runnable {

	public Circle(double radius) {
		super(radius);
	}
	
	public double area() {
		double area=getPi()*getRadius()*getRadius();
		return area;
	}

	//Thread Job
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+" calculates area as :"+area());
	}

}
