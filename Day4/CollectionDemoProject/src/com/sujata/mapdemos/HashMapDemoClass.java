package com.sujata.mapdemos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemoClass {

	public static void main(String[] args) {
		/*
		 * HashMap is unordered key-value pairs, 
		 * where keys are unique and values can be duplicated,
		 * unordering wrt key, 
		 * and again collection if autogrowable and auto shrinkable
		 */
		
		Map<String,Integer> months=new HashMap<String, Integer>();
		
		System.out.println("Size : "+months.size());
		System.out.println(months);
		
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);

		System.out.println("Size : "+months.size());
		System.out.println(months);
		months.put("Feb", 29);
		months.put("May", 31);
		
		System.out.println("Size : "+months.size());
		System.out.println(months);
		
		months.put("Jun", 30);
		months.put("Jul", 31);
		
		System.out.println("Size : "+months.size());
		System.out.println(months);

		months.remove("Jun");
		System.out.println("Size : "+months.size());
		System.out.println(months);
		
		Set<String> monthNames=months.keySet();
		for(String monthName:monthNames) {
			System.out.println(monthName+" has "+months.get(monthName)+" days");
		}
		
		
	}

}
