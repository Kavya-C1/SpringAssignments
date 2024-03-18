package com.voya.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InstrumentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext("com.voya.auto");
		Performer performer = context.getBean("performer",Performer.class);
		performer.playMusic("v", "sing");
		performer.playMusic("k", "a");
		performer.playMusic("g", "song");
		
	}

}
