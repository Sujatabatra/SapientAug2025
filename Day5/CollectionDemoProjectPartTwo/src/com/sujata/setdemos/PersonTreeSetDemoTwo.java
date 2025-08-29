package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.sujata.misc.Person;
import com.sujata.misc.PersonSortByName;

public class PersonTreeSetDemoTwo {

	public static void main(String args[]) {

		Set<Person> objectCollection = new TreeSet<>(new PersonSortByName());

		System.out.println("Size of Collection : " + objectCollection.size());
		System.out.println(objectCollection);

		objectCollection.add(new Person(111,"AAA",78));
		objectCollection.add(new Person(222,"XYZ",18));
		objectCollection.add(new Person(333,"CCC",78));

		System.out.println("Size of Collection : " + objectCollection.size());
		System.out.println(objectCollection);

		objectCollection.remove(new Person(111,"AAA",78));
		System.out.println("Size of Collection : " + objectCollection.size());
		System.out.println(objectCollection);

		objectCollection.add(new Person(444,"AAA",78));
		objectCollection.add(new Person(111,"AAA",78));

		System.out.println("Size of Collection : " + objectCollection.size());
		System.out.println(objectCollection);

		System.out.println("Traversal using foreach");
		for (Person element : objectCollection) {
			System.out.println(element);
		}
		/*
		 * iterator() is a factory method from HashSet, which is returning me the object
		 * of Iterator interface
		 */
		System.out.println("Traversal Using Iterator");
		Iterator<Person> iterator = objectCollection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
