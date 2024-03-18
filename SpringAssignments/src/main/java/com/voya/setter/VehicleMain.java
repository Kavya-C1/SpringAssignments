package com.voya.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.voya.setter.Vehicle;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.voya.setter");
		Vehicle vehicle1 = context.getBean("vehicle",Vehicle.class);
		System.out.println(vehicle1);
		
		
	}

}
