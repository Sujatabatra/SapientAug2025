package com.sujata.employee.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.employee.entity.Employee;
import com.sujata.employee.exception.EmployeeAlreadyExistException;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public ArrayList<Employee> getAllRecords() {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		Connection connection = null;
		try {
//			1. Connect to DB
//			1.1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to Database
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sapient", "root", "sujata");

//			2. Statement
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE");
//			DQL Statement , we will always use execute query and return type is ResultSet
			ResultSet resultSet = preparedStatement.executeQuery();

//			3.Processing Result
			while (resultSet.next()) {
				int id = resultSet.getInt("ID");
				String name = resultSet.getString("NAME");
				String desig = resultSet.getString("DESIGNATION");
				String deptt = resultSet.getString("DEPARTMENT");
				double sal = resultSet.getDouble("SALARY");

				empList.add(new Employee(id, name, desig, deptt, sal));

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
//				4.Close Connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return empList;
	}

	@Override
	public int addRecord(Employee employee)throws EmployeeAlreadyExistException {
		try (

				Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sapient", "root",
						"sujata");) {
			Class.forName("com.mysql.cj.jdbc.Driver");

			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO EMPLOYEE VALUE(?,?,?,?,?)");
			preparedStatement.setInt(1, employee.getEmployeeId());
			preparedStatement.setString(2, employee.getEmployeeName());
			preparedStatement.setString(3, employee.getDesignation());
			preparedStatement.setString(4, employee.getDepartment());
			preparedStatement.setDouble(5, employee.getSalary());
			
// DQL Statement , we will always use executeUpdate and return type is int
			int rows=preparedStatement.executeUpdate();
			return rows;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			throw new EmployeeAlreadyExistException(employee.getEmployeeId()+"ID already exist");
		}
		return 0;
	}

}
