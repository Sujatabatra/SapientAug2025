package com.sujata.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemoClass {

	public static void main(String arg[]) {
		try (BufferedReader reader = new BufferedReader(new FileReader("demoFile"))) {
            int ch;
            
            while((ch=reader.read())!=-1) {
            	System.out.print((char)ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
}
