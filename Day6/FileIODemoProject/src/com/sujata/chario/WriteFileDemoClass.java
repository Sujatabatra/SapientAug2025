package com.sujata.chario;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemoClass {

	public static void main(String[] args) {
		
		try( FileWriter fileWriter=new FileWriter("CharDemo");){
			
			String str="This code is representing Char Input to file!";
			
			fileWriter.write(str);
			
			System.out.println("File Created!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
