package com.sujata.objectio;

import java.io.Serializable;

public class MyPerson implements Serializable {

	static final long serialVersionUID = 1L;
	
	private int personId;
	private String personName;
	transient private int personAge;
	private String bloodGroup;
	
	public MyPerson() {
		
	}

	

	public MyPerson(int personId, String personName, int personAge) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
	}



	public MyPerson(int personId, String personName, int personAge, String bloodGroup) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
		this.bloodGroup = bloodGroup;
	}



	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}


	public String getBloodGroup() {
		return bloodGroup;
	}


	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge
				+ ", bloodGroup=" + bloodGroup + "]";
	}

	
	
}
