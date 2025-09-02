package com.sujata.demo;

public class MyFirstThreadMain {

	public static void main(String[] args) {
		//New Born
		MyFirstThread thread1=new MyFirstThread();
		MyFirstThread thread2=new MyFirstThread();
		MyFirstThread thread3=new MyFirstThread();
		
		//Ready or Running state
		thread1.start();
		thread2.start();
		thread3.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());

	}

}
