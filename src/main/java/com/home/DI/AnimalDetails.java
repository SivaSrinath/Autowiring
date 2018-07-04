package com.home.DI;

import org.springframework.beans.factory.annotation.Autowired;

import com.home.implementations.Cat;
import com.home.implementations.Dog;

public class AnimalDetails {
	
	@Autowired
	private Cat cat;
	
	@Autowired
	private Dog dog;
	
	public void getCatDetails() {
		cat.run();
		cat.walk();
	}
	
	public void getDogDetails() {
		dog.run();
		dog.walk();
	}

}
