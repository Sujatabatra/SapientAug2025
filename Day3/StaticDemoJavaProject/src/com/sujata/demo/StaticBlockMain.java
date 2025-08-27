package com.sujata.demo;

class StaticBlockBase{
	static {
		System.out.println("Hi I am static block from Base");
	}
	
	{
		System.out.println("Hi I am instance block from Base");
	}
	
	public StaticBlockBase() {
		System.out.println("Hi I am constructor from Base");
	}
}

class StaticBlockDerived extends StaticBlockBase{
	static {
		System.out.println("Hi I am static block from Derived");
	}
	
	{
		System.out.println("Hi I am instance block from Derived");
	}
	
	public StaticBlockDerived() {
		System.out.println("Hi I am constructor from Derived");
	}
}
public class StaticBlockMain {

	public static void main(String[] args) {
	
		StaticBlockBase staticBlockBase=new StaticBlockBase();
		
		StaticBlockDerived staticBlockDerived=new StaticBlockDerived();
	}

}
