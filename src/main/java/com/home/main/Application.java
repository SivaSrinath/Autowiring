package com.home.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.DI.AnimalDetails;

public class Application {
	
	public static void main(String args[]) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/home/config/beans.xml");
		AnimalDetails animalDetails=context.getBean(AnimalDetails.class);
		animalDetails.getCatDetails();
		
	}

}
