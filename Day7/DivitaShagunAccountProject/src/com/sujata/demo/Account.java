package com.sujata.demo;

public class Account implements Runnable {

	private int balance=1000;
	
	//Instance method as synchronized : Object Level
	synchronized public void withdraw() {
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
	
	@Override
	public void run() {
		withdraw();

	}

}
