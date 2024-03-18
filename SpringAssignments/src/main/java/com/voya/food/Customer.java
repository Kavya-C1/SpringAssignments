package com.voya.food;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.voya.auto.Performer;

public class Customer {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.voya.food");
		Waiter waiter = context.getBean("waiter",Waiter.class);
		
		waiter.viewMenuCard("chinese");
		
		
	}

}
