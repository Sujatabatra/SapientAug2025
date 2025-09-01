package com.sujata.chario;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemoClass {

	public static void main(String[] args) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("demoFile"))) {
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("BufferedWriter makes writing efficient.");
        } catch (IOException e) {
            e.printStackTrace();
        }
		

	}

}
