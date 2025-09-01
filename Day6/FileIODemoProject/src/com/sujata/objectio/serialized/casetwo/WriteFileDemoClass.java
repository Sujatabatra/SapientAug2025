package com.sujata.objectio.serialized.casetwo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteFileDemoClass {

	public static void main(String[] args) {
		
		try(
				FileOutputStream fileOutputStream=new FileOutputStream("PersonData");
				ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
				
				){
			
			Person person=new Person(111, "AAAA");
			person.setAddress(new Address(101, "My Street", "Some City", "Some state", "12345"));
			
			objectOutputStream.writeObject(person);
			System.out.println("File Created ");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
