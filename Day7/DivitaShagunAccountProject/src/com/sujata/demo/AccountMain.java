package com.sujata.demo;

public class AccountMain {

	public static void main(String[] args) {
		
		Account A001=new Account();
		
		Thread divita=new Thread(A001, "Divita");
		Thread shagun=new Thread(A001,"Shagun");
		
		divita.start();
		shagun.start();

	}

}
