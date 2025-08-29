package com.sujata.employee.persistence;

import java.util.ArrayList;

import com.sujata.employee.entity.Employee;
import com.sujata.employee.exception.EmployeeAlreadyExistException;

public interface EmployeeDao {

	ArrayList<Employee> getAllRecords();
	int addRecord(Employee employee)throws EmployeeAlreadyExistException;
}
