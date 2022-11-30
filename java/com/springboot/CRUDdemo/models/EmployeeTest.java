package com.springboot.CRUDdemo.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.CRUDdemo.entity.Employee;

@SpringBootTest
public class EmployeeTest {
    
	private Employee employee; 
	
	@BeforeEach
	void setUp() {
		employee = new Employee("John", "Rain", "aa@mail.com");
	}
	
	@Test
	public void testEmployee() {
		assertEquals(employee.getFirstName(), "John");
		assertEquals(employee.getLastName(), "Rain");
		assertEquals(employee.getEmail(), "aa@mail.com");
	}
		
}
