package com.springboot.CRUDdemo.service;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EmployeeServiceTest {
	
	private EmployeeService empService = new MockEmployeeService();
	
	
	@Test
	void testFindAllIsNotNull() {
		assertNotNull(empService.findAll());
	}
	
	@Test
	void testSizeOfAllStudents() {
		assertEquals(empService.findAll().size(), 3);
	}
	

}
