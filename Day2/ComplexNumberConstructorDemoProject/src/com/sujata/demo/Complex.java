package com.sujata.demo;
/*
 * 1.Constructor name must be same as that of class name
 * 2.Constructor can be argumented as well as not argumented
 * 3.Constructor cannot return any value not even void
 * 4. Constructor can exist in any scope, i.e private,default,protected and public
 * 5. If my class is constructor challenged(i.e class have not constructor)
 * then compiler create one default(i.e zero argument constructor ) for us.
 */
public class Complex {

	private int real;
	private int imagenary;

	
	private Complex() {
		
	}
	
	public Complex(int real) {
		super();
		this.real = real;
	}


	Complex(int real, int imagenary) {
		this.real = real;
		this.imagenary = imagenary;
	}


	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImagenary() {
		return imagenary;
	}

	public void setImagenary(int imagenary) {
		this.imagenary = imagenary;
	}

	public void display() {
		System.out.print(real);
		if (imagenary > 0)
			System.out.println(" +" + imagenary + "i");
		else if (imagenary < 0)
			System.out.println(imagenary + "i");

	}
	
	public void add(Complex c1,Complex c2) {
		this.real=c1.real+c2.real;
		this.imagenary=c1.imagenary+c2.imagenary;
	}
	
	public Complex sum(Complex complex2) {
		Complex sumComplex=new Complex();
		sumComplex.real=this.real+complex2.real;
		sumComplex.imagenary=this.imagenary+complex2.imagenary;
		return sumComplex;
	}
}
