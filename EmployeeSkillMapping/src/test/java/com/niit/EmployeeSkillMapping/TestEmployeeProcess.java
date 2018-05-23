package com.niit.EmployeeSkillMapping;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;
import com.niit.config.AppContext;
import com.niit.model.Employee;
import com.niit.service.EmployeeService;


@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppContext.class)

public class TestEmployeeProcess {

Employee emp;
@Autowired
EmployeeService employeeService;
//Employee emp;


@Before
public void setup()
{
	emp=new Employee();
	//employeeService=new EmployeeServiceImpl();
	//System.out.println("Object is created.");
}
@Test
public void testAddEmployee() {
	
    emp.setEmpId(1003);
    emp.setEmpName("Deepti");
    emp.setEmpAddress("niit");
    emp.setEmpDesignation("faculty");
    emp.setEmpDob("10/10/2000");
    emp.setEmpExp(8);
    emp.setEmpGender("female");
    emp.setEmpLocation("asr");
    emp.setEmpMailId("niit2@mail.com");
    emp.setEmpPass("niit");
    emp.setEmpMob("9988778899");
    emp.setEmpQuali("msc");
    emp.setEmpRole("trainer");
    emp.setEmpSkill("java");
    emp.setEmpStatus("valid");
    Assert.assertEquals(true, employeeService.addEmployee(emp));
    
}

@After
public void tearOut()
{
	//emp=null;
//	employeeService=null;
}
@Test
public void testUpdateEmployee() {
	}
@Test
public void testdeleteEmployee() {
	
	

	
}


	
}
