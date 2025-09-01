package com.sujata.objectio.serialized.caseone;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Employee extends Person {

	private String department;
	private String designation;
	private double salary;
	
	public Employee() {
		
	}

	public Employee(int pId, String pName, String department, String designation, double salary) {
		super(pId, pName);
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [department=" + department + ", designation=" + designation + ", salary=" + salary
				+ ", getpId()=" + getpId() + ", getpName()=" + getpName() + "]";
	}
	
	
	private void writeObject(ObjectOutputStream objectOutputStream)throws NotSerializableException{
		throw new NotSerializableException();
	}
	
	private void readObject(ObjectInputStream objectInputStream)throws NotSerializableException{
		throw new NotSerializableException();
	}

	
}
