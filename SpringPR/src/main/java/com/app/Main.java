package com.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Employee;
import com.repository.EmployeeRepository;

public class Main {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		EmployeeRepository er = (EmployeeRepository) context.getBean("employeeRepository"); 
//		Iterable<Employee> list = er.findAll(); 
		
// Spring Core, Spring Data
		
	}

}
