package com.sujata.employee.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar;
import com.sujata.employee.entity.Employee;
import com.sujata.employee.exception.EmployeeAlreadyExistException;
import com.sujata.employee.service.EmployeeService;
import com.sujata.employee.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("Employee Management System");
		System.out.println("1. Display All Employees");
		System.out.println("2. Add New Employee");
		System.out.println("3. Exit");
		

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		
		switch (choice) {
		case 1: 
			ArrayList<Employee> employeeList=employeeService.getAllEmployees();
			for(Employee employee:employeeList) {
				System.out.println(employee);
			}
			break;
		case 2: 
			
			try {
				Employee employee=new Employee();
				System.out.println("Enter ID : ");
				employee.setEmployeeId(scanner.nextInt());
				System.out.println("Enter name : ");
				employee.setEmployeeName(scanner.next());
				System.out.println("Enter Employee Designation : ");
				employee.setDesignation(scanner.next());
				System.out.println("Enter Employee Department : ");
				employee.setDepartment(scanner.next());
				System.out.println("Enter Employee Salary : ");
				employee.setSalary(scanner.nextDouble());
				
				employeeService.saveEmployee(employee);
				System.out.println("Employee Added");
			}
			catch(EmployeeAlreadyExistException employeeAlreadyExistException) {
				System.out.println(employeeAlreadyExistException.getMessage());
			}
			catch(Exception exception) {
				System.out.println("Something went wrong, please try again");
			}
			
			break;
		case 3:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	}

}
