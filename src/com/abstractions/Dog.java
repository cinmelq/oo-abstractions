package com.abstractions;

public class Dog implements Mammal {

	public void drinkMilk() {
		System.out.println("Dog: glup glup");
	}

	public void hunt() {
		System.out.println("1. Run");
		System.out.println("2. Eat");
	}

	public void bark() {
		System.out.println("🐶");
	}
}
