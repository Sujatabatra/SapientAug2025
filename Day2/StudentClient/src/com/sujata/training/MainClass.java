package com.sujata.training;

import com.sujata.demo.Student;

public class MainClass {

	public static void main(String[] args) {
		Student student=new Student();
		student.inputData(1, "AAAA");
		student.display();

		System.out.println("=============");
		
		Marks marks=new Marks();
		marks.inputData(111, "Ashish", 45, 89, 90);
		marks.display();
		
		System.out.println("================");
		
		Grade grade=new Grade();
		grade.inputData(101, "Bharti", 89, 67, 45);
		grade.display();
	}

}
