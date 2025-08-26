package com.sujata.demo;

public interface Shape {

	void area();
	
	default void volume() {
		dummy();
		System.out.println("This shape does not support volume");
	}
	
	private void dummy() {
		System.out.println("Got introduced in 1.9");
	}
}
