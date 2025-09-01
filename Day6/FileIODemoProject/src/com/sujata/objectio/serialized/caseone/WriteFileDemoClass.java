package com.sujata.objectio.serialized.caseone;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteFileDemoClass {

	public static void main(String[] args) {
		
		try(
				FileOutputStream fileOutputStream=new FileOutputStream("EmployeeData");
				ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
				
				){
			
			Employee employee=new Employee(101, "Ashish", "Sales", "Executive", 35000);
			objectOutputStream.writeObject(employee);
			System.out.println("File Created ");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
