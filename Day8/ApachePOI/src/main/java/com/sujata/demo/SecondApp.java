package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SecondApp {

	public static void main(String[] args) {

	Workbook workbook = null;
	try (FileInputStream fileInputStream = new FileInputStream("person.xlsx");) {

//		XSSF It’s Stand for “XML Spreadsheet Format”. It is used for xlsx file format of MS-Excel.
		workbook = new XSSFWorkbook(fileInputStream);

		int noOfSheets = workbook.getNumberOfSheets();
		for (int i = 0; i <noOfSheets; i++) {
			Sheet sheet = workbook.getSheetAt(i);

			Iterator<Row> rowIterator = sheet.iterator();
			
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();

				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();

					switch(cell.getCellType()) {
					case STRING:
						System.out.println(cell.getStringCellValue());
						break;
					case NUMERIC:
						System.out.println(cell.getNumericCellValue());
					}
				}
			}
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
