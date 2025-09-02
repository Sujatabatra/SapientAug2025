package com.sujata.demo;

public class MyAccountMain {

	public static void main(String[] args) {
		
		MyAccount A001=new MyAccount();
		MyAccount A002=new MyAccount();
		
		Thread neha=new Thread(A001, "Neha");
		Thread vaibhav=new Thread(A002,"Vaibhav");
		
		neha.start();
		vaibhav.start();

	}

}
