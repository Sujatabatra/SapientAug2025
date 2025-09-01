package com.sujata.demo;

public class CarRentalSystem {

	public static void main(String[] args) {
		BMW bmw=new BMW("X6", "Silver");
		BMW bmw1=new BMW("X3", "Blue");
		Audi audi=new Audi("Q3", "Black");
		Toyota toyota=new Toyota("Altis", "Golden");
		
		
		SportsCar bmwSports=new SportsCar(bmw);
		bmwSports.sportsEngine();
		
//		Driver sonu=new Driver("Sonu");
//		Driver ramesh=new Driver("Ramesh");
//	
//		ramesh.setCar(bmw);
//		ramesh.drive();

	}

}
