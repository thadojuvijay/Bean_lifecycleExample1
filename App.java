package com.ecil.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
	
		
		ApplicationContext container=new AnnotationConfigApplicationContext(Person.class);
Person person = container.getBean(Person.class);
person.display();
	}

}
