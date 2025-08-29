package com.sujata.misc;

public class EqualityCheckClass {

	public static void main(String[] args) {
		int i=10;
		int j=10;
		
		if(i==j)
			System.out.println("Both i and j are equal");
		else
			System.out.println("Both i and j are not equal");
		
		Person person1=new Person(101, "AAAA", 45);
		Person person2=new Person(101, "AAAA", 45);
		
		if(person1==person2)
			System.out.println("person1 and person2 are equal");
		else
			System.out.println("person1 and person2 are not equal");
		
		Person person3=person1;
		

		if(person1==person3)
			System.out.println("person1 and person3 are equal");
		else
			System.out.println("person1 and person3 are not equal");
		
		
		if(person2.equals(person1))
			System.out.println("both are equal");
		else
			System.out.println("both are equal");
		
		System.out.println("person1 : "+person1.hashCode());
		System.out.println("person2 : "+person2);
	}

}
