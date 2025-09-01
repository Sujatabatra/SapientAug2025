package com.sujata.objectio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteFileDemoClassTwo {

	public static void main(String[] args) {
		
		try(
				FileOutputStream fileOutputStream=new FileOutputStream("PersonDataTwo");
				ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
				
				){
			
			MyPerson person=new MyPerson(111, "AAAA", 40,"B+ve");
			objectOutputStream.writeObject(person);
			System.out.println("File Created ");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
