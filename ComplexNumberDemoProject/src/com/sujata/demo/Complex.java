package com.sujata.demo;

public class Complex {

	private int real;
	private int imagenary;

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
