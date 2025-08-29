package com.sujata.misc;

import java.util.Comparator;

public class PersonSortByID implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		if(o1.equals(o2))
			return 0;
		if(o1.getPersonId()>o2.getPersonId())
				return 1;
		else
			return -1;
	}

}
