package com.sujata.listdemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemoClass {

	public static void main(String arg[]) {
		/*
		 * ArrayList is the duplicate indexed ordered collection of elements,
		 * which are auto growable and auto shrinkable
		 */
		List<Integer> objectCollection=new ArrayList<Integer>();
		
		System.out.println("Size : "+objectCollection.size());
		System.out.println(objectCollection);
		
		objectCollection.add(10);
		objectCollection.add(100);
		objectCollection.add(56);
		objectCollection.add(10);
		
		System.out.println("Size : "+objectCollection.size());
		System.out.println(objectCollection);
		
		objectCollection.remove(1);
		objectCollection.add(560);
		System.out.println("Size : "+objectCollection.size());
		System.out.println(objectCollection);
		
		System.out.println("Traversal using traditional for loop");
		for(int index=0;index<objectCollection.size();index++) {
			System.out.println(objectCollection.get(index));
		}
		
		System.out.println("Traversal using for each");
		for(Integer element:objectCollection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using iterator");
		Iterator<Integer> iterator=objectCollection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Reverse Collection Traversal using ListIterator");
		ListIterator<Integer> listIterator=objectCollection.listIterator();
		while(listIterator.hasNext())
			listIterator.next();
		
		while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
	}
}
