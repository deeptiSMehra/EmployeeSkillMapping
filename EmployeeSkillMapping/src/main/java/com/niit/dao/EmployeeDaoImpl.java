package com.niit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Employee;

@Repository("employeeDAO")
@Transactional
public class EmployeeDaoImpl implements EmployeeDaoInterface {
	@Autowired
	private SessionFactory sessionFactory;
public List<Employee> findAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

	public Employee findById(int empId) {
		
		return (Employee)sessionFactory.getCurrentSession()
				.createQuery("from Employee where empId="+empId)
				.uniqueResult();
	}

	public boolean addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
		return true;
	}

	public boolean updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		return true;
	}

	public boolean deleteEmployee(int empId) {
		sessionFactory.getCurrentSession().delete(findById(empId));	
		return true;
	}

	public Employee findByName(String name) {
		return (Employee)sessionFactory.getCurrentSession()
				.createQuery("from Employee where empName='"+name+"'")
				.uniqueResult();
	}

	public boolean valiadteEmployee(String emailId, String password) {
		Query  query=sessionFactory.getCurrentSession().createQuery("from employee where empMailId=' "+emailId+"' and emppass='"+password+"'");
		Employee emp=(Employee)query.uniqueResult();
		if(emp!=null)
			return true;
		else
		return false;
	}


	

}
