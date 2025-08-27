package com.sujata.demo;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOpenClassMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String fName=null;
		try {
		System.out.println("Enter FileName : ");
		fName=scanner.next();
		
		FileOpenClass fileOpenClass=new FileOpenClass(fName);
			System.out.println(fName+" exist on disk");
		}
		catch(FileNotFoundException fileNotFoundException) {
			System.out.println(fName+" does not exist on disk");
		}
	}

}
