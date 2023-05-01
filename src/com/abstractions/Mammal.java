package com.abstractions;

public abstract class Mammal {
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public abstract void drinkMilk();
	
	public abstract void hunt();
}
