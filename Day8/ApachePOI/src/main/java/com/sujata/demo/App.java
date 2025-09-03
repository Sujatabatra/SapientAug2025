package com.sujata.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
    	XSSFWorkbook workbook = new XSSFWorkbook(); 

        //Create file system using specific name
        FileOutputStream out = new FileOutputStream(new File("myworkbook.xlsx"));
        //write operation workbook using file out object 
        workbook.write(out);
        out.close();
        System.out.println("myworkbook.xlsx written successfully");
    }
}
