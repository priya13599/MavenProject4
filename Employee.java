package com.nucleus.autowiring;

import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	
	
public void display()
{
	System.out.println("Employee Details");
}
}
