package com.sujata.demo;

public class MyFirstThread extends Thread {

	//Job of a Thread
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+"started ");
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}
