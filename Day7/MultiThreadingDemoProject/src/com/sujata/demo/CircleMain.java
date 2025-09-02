package com.sujata.demo;

public class CircleMain {

	public static void main(String[] args) {
		Thread thread1=new Thread(new Circle(5.6));
		Thread thread2=new Thread(new Circle(6.7));
		thread1.start();
		thread2.start();
	}

}
