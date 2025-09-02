package com.sujata.demo;

public class Shape {

	private double radius;
	private final static double PI=3.142;
	
	public Shape(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public static double getPi() {
		return PI;
	}
	
	
	
}
