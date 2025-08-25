package com.sujata.demo;

public class MainComplex {

	public static void main(String[] args) {
		Complex complex1=new Complex();
		complex1.setReal(6);
		complex1.setImagenary(7);
		complex1.display();
		
		Complex complex2=new Complex();
		complex2.setReal(8);
		complex2.setImagenary(4);
		complex2.display();
		
		Complex complex3=new Complex();
		complex3.add(complex1, complex2);
		complex3.display();
		
		
		Complex complex4=complex1.sum(complex2);
		complex4.display();

	}

}
