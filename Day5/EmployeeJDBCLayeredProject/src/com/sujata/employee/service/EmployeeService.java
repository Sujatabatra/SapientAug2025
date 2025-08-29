package com.sujata.employee.service;

import java.util.ArrayList;

import com.sujata.employee.entity.Employee;
import com.sujata.employee.exception.EmployeeAlreadyExistException;

public interface EmployeeService {

	ArrayList<Employee> getAllEmployees();
	void saveEmployee(Employee employee)throws EmployeeAlreadyExistException;
}
