package com.revature.daos;

import java.util.List;

import com.revature.beans.Employees;

public interface EmployeesDAO {
	
	public List<Employees> getEmployees();
	public Employees getEmployeeById(int id);
	public Employees authenticateEmployees(String username, String password);
	public void insertEmployee(int id, String firstName, String lastName, String username, String position, 
			boolean management, String password);

}
