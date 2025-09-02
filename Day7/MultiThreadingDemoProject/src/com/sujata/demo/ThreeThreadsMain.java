package com.sujata.demo;

public class ThreeThreadsMain {

	public static void main(String[] args) {
		//New Born State
		MyFirstThread thread1=new MyFirstThread();
		MySecondThread thread2=new MySecondThread();
		MyThirdThread thread3=new MyThirdThread();

		//Ready or Running
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}

}
