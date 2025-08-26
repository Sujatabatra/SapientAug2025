package com.sujata.demo;

public class MainShapePerform {

	public static void main(String[] args) {
		ShapePerform shapePerform=new ShapePerform();
		
		shapePerform.setShape(new Cube());
		shapePerform.perform();
		System.out.println("===============");
		shapePerform.setShape(new Square(4));
		shapePerform.perform();

	}

}
