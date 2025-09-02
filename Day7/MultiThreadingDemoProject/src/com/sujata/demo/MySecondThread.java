package com.sujata.demo;

public class MySecondThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is too lazy to do anything");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" woke up!");
	}
}
