package com.sujata.demo;

/*
 * To Apply Class level locking
 * 1. make static method as synchronized
 * 2. while making synchronized block , use this
 * synchronized(ClassName.class){
 * -
 * -
 * -
 * }
 */
public class MyAccount implements Runnable {

	private static int balance=1000;
	

	public void withdraw() {		
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
