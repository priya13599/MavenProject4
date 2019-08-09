package com.nucleus.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringDemo {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("autowiring.xml");
		Student std=(Student)context.getBean("std1");
		System.out.println(std.getStdId()+" "+std.getSname());
		System.out.println(std.getAddress());
		System.out.println(std.getAddress().getCity());
		System.out.println(std.getAddress().getState());
		
		
		//Stereotype Annotations Demo
		//Employee employee=(Employee)context.getBean("employee");
		Employee employee=(Employee)context.getBean("emp");
		employee.display();
		

	}

}
