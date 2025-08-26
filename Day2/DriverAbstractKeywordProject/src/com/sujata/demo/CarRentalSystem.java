package com.sujata.demo;

public class CarRentalSystem {

	public static void main(String[] args) {
		BMW bmw=new BMW("X6", "Silver");
		Audi audi=new Audi("Q3", "Black");
		Toyota toyota=new Toyota("Altis", "Golden");
		
		Driver sonu=new Driver("Sonu");
		Driver ramesh=new Driver("Ramesh");
	
		ramesh.setCar(bmw);
		ramesh.drive();

	}

}
