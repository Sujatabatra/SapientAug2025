package com.sujata.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemoClass {

	public static void main(String[] args) {
		try(FileReader fileReader=new FileReader("CharDemo")){
			
			int ch;
			while((ch=fileReader.read())!=-1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
