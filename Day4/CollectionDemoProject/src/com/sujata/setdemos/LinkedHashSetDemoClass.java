package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemoClass {

	public static void main(String[] args) {
		/*
		 * LinkedHashset is the unique ordered collectionj of objects which are
		 * autogrowable and autoshrinkable
		 */
		Set<Integer> objectCollection=new LinkedHashSet<>();
		
		System.out.println("Size of Collection : "+objectCollection.size());
		System.out.println(objectCollection);
		
		objectCollection.add(30);
		objectCollection.add(25);
		objectCollection.add(70);
		
		System.out.println("Size of Collection : "+objectCollection.size());
		System.out.println(objectCollection);
		
		objectCollection.remove(25);
		System.out.println("Size of Collection : "+objectCollection.size());
		System.out.println(objectCollection);
		
		objectCollection.add(100);
		objectCollection.add(30);
		
		System.out.println("Size of Collection : "+objectCollection.size());
		System.out.println(objectCollection);
		
		System.out.println("Traversal using foreach");
		for(Integer element:objectCollection) {
			System.out.println(element);
		}
		/*
		 * iterator() is a factory method from HashSet,
		 *  which is returning me the object of Iterator interface
		 */
		System.out.println("Traversal Using Iterator");
		Iterator<Integer> iterator=objectCollection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		

	}

}
