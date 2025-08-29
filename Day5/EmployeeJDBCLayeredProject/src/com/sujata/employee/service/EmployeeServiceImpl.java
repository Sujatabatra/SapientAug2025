package com.sujata.employee.service;

import java.util.ArrayList;

import com.sujata.employee.entity.Employee;
import com.sujata.employee.exception.EmployeeAlreadyExistException;
import com.sujata.employee.persistence.EmployeeDao;
import com.sujata.employee.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	@Override
	public ArrayList<Employee> getAllEmployees() {
		return employeeDao.getAllRecords();
	}

	@Override
	public void saveEmployee(Employee employee)throws EmployeeAlreadyExistException {
		
		employeeDao.addRecord(employee);
	}

}
