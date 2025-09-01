package com.sujata.objectio.serialized.casetwo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private int pId;
	private String pName;
	transient private Address address;
	
	public Person() {
		
	}

	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}

	
	public Person(int pId, String pName, Address address) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.address = address;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", address=" + address + "]";
	}

	
	private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
		objectOutputStream.defaultWriteObject();
		objectOutputStream.writeObject(address.getHouseNumber());
		objectOutputStream.writeObject(address.getStreetName());
		objectOutputStream.writeObject(address.getCity());
		objectOutputStream.writeObject(address.getState());
		objectOutputStream.writeObject(address.getPinCode());
		
	}
	
	private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
		
		objectInputStream.defaultReadObject();
		address=new Address((int)objectInputStream.readObject(), (String)objectInputStream.readObject(),(String)objectInputStream.readObject(), (String)objectInputStream.readObject(),(String)objectInputStream.readObject());
	}

	
	
	
}
