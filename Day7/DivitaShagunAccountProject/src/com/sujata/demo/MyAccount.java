package com.sujata.demo;

public class MyAccount implements Runnable {

	private static int balance=1000;
	

	public void withdraw() {
//		Object Level Lock
//		synchronized (this) {
		
//		Class Level Lock
		synchronized (MyAccount.class) {	
		if(balance>800) {
			System.out.println(Thread.currentThread().getName()+" you have sufficient balance to withdraw and your balance is Rs."+balance);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance-=800;
			System.out.println(Thread.currentThread().getName()+" balance after withdraw is Rs."+balance);
		}
		else {
			System.out.println(Thread.currentThread().getName()+" you don't have sufficient balance to withdraw and your balance is Rs."+balance);
		}
		}	
	}
	
	@Override
	public void run() {
		withdraw();

	}

}
