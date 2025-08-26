package com.sujata.demo;

public class ShapePerform {

	Shape shape;
	
	
	public void setShape(Shape shape) {
		this.shape = shape;
	}


	public void perform() {
		shape.area();
		shape.volume();
	}
}
