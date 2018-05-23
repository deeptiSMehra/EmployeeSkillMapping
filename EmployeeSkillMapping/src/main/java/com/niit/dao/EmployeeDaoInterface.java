package com.niit.dao;

import java.util.List;

import com.niit.model.Employee;

public interface EmployeeDaoInterface
{
	public List<Employee> findAll();
	public Employee findById(int empId);
	public Employee findByName(String name);
	public boolean addEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(int empId);
	public boolean valiadteEmployee(String emailId,String password);
	
	

}
