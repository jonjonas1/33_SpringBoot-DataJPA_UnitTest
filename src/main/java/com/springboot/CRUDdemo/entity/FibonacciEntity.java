package com.springboot.CRUDdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FibonacciEntity {
	
	@Id
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public FibonacciEntity() {
		
	}
	
	public FibonacciEntity(int number) {
		this.number = number;
	}

	
	
}
