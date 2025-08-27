package com.sujata.demo;

public class MainDerived {

	public static void main(String[] args) {
		BaseClass baseClass;
		
		baseClass=new BaseClass();
		baseClass.first();
		baseClass.second();
		
		baseClass=new Derived();
		baseClass.first();
		baseClass.second();
		
		Derived.second();

	}

}
