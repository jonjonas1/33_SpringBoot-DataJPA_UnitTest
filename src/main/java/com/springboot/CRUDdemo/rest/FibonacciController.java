package com.springboot.CRUDdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.CRUDdemo.entity.FibonacciEntity;

@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {

//	@GetMapping("/findNumber")
//	public FibonacciEntity findFibonnaciNumber(@RequestParam int n){
//		return FibonacciEntity.ok(fibonacci(n));
//		return 1;
//	}
	
	
	private int fibonacci(int position) {
		if(position <=1)
			return position;
		return fibonacci(position-1) + fibonacci(position -2);
	}
}
