package com.sujata.demo;

public class MyFirstThreadDemo {

	static void show() {
		System.out.println("show method is called by Thread "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i "+i);
		}
		show();
		
		System.out.println("Good Bye from "+Thread.currentThread().getName()+" Thread");
		

	}

}
