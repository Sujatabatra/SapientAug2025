package com.sujata.demo;

public class GenericClassTwo<T extends Number> {

	private T value;
	
	public GenericClassTwo() {
		
	}
	public GenericClassTwo(T value) {
		super();
		this.value = value;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	
	public void sum() {
		int add1;
		double add2;
		if(value.getClass().equals(Integer.class)) {
			add1=value.intValue()+value.intValue();
			System.out.println("Sum : "+add1);
		}
		else if(value.getClass().equals(Double.class)) {
			add2=value.doubleValue()+value.doubleValue();
			System.out.println("Sum : "+add2);
		}
	}
	
}
