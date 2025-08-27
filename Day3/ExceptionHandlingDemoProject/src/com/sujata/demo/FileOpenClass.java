package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileOpenClass {

	private FileInputStream fileInputStream;
	private String fileName;

	public FileOpenClass(String fileName) throws FileNotFoundException {
		this.fileName = fileName;
		fileInputStream = new FileInputStream(fileName);
	}

}
