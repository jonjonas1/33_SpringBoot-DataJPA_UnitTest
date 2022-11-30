package com.springboot.CRUDdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.springboot.CRUDdemo.entity.Employee;

class MockEmployeeService implements EmployeeService {
	
	
	private List<Employee> listEmployee = new ArrayList<>() ;
	
	
	public MockEmployeeService() {
		listEmployee
		.add(new Employee("John", "Rain", "aa@mail.com"));
		listEmployee
		.add(new Employee("John", "Rain", "aa@mail.com"));
		listEmployee
		.add(new Employee("John", "Rain", "aa@mail.com"));
	}
	

	@Override
	public List<Employee> findAll() {
		return listEmployee;
	}

	@Override
	public Employee findById(int theId) {
		Employee emp = listEmployee
				.stream()
				.filter(e -> e.getId() == theId)
				.findFirst()
				.get();
		
		return emp;
	}

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}
	
}
