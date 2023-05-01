package com.abstractions;

public class TestMammal {

	public static void main(String[] args) {
		Cat lara = new Cat();
		lara.drinkMilk();
		lara.hunt();
		lara.meow();
		System.out.println();
		Dog mike = new Dog();
		mike.drinkMilk();
		mike.hunt();
		mike.bark();
		System.out.println();
		Whale winnie = new Whale();
		winnie.drinkMilk();
		winnie.hunt();
		winnie.vocalize();
	}
}
