package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FourthDemo {

	static void fileOpen(String fileName) {
		FileInputStream fileInputStream=null;
		try {
			fileInputStream=new FileInputStream(fileName);
			System.out.println(fileName+" file opened for reading");
		} catch (FileNotFoundException e) {
			System.out.println("File "+fileName+" does not exist for reading");
		}
		finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				
			}
			catch(Exception exception) {
				
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter FileName : ");
		String fileName=scanner.next();
		fileOpen(fileName);
		
	}

}
