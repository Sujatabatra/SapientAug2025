package com.sujata.misc;

import java.util.Objects;

public class Person implements Comparable<Person> {

	private int personId;
	private String personName;
	private int age;
	
	public Person() {
		
	}

	public Person(int personId, String personName, int age) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, personId, personName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && personId == other.personId && Objects.equals(personName, other.personName);
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		if(this.equals(o))
			return 0;
		if(this.age>o.age)
			return 1;
		else 
			return -1;
		
	}
	
	
}
