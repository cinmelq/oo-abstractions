package com.abstractions;

public class Cat extends Mammal {

	public void drinkMilk() {
		System.out.println("Cat: glup glup");
	}

	public void hunt() {
		System.out.println("1. Hide");
		System.out.println("2. Watch");
		System.out.println("3. Run");
		System.out.println("4. Jump");
		System.out.println("5. Eat");
	}

	public void meow() {
		System.out.println("🐈");
	}
}
