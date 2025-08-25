package com.vrinda.demo;

import com.sujata.demo.Factorial;
import com.sujata.demo.FactorialTwo;

public class Series {

	private int total,sumSeries;
	public void setTotal(int total) {
		this.total = total;
	}
	public int getSumSeries() {
		calulateSum();
		return sumSeries;
	}
	private void calulateSum() {
		Factorial factorial=new Factorial();
		for(int number=1;number<=total;number++) {
			factorial.setNumber(number);
			sumSeries=sumSeries+number/factorial.getFactorial();
		}
	}
	public void dummy() {
		DemoClass dc=new DemoClass();
	}
	
}
