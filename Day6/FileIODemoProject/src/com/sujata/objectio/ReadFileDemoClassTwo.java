package com.sujata.objectio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFileDemoClassTwo {

	public static void main(String[] args) {
		try(
				FileInputStream fileInputStream=new FileInputStream("PersonDataTwo");
				ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
				){
			
			MyPerson person=(MyPerson)objectInputStream.readObject();
			System.out.println(person);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
