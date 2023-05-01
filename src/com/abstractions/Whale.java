package com.abstractions;

public class Whale implements Mammal {

	public void drinkMilk() {
		System.out.println("Whale: glup glup");
	}

	public void hunt() {
		System.out.println("1. Swim");
		System.out.println("2. Open mouth");
	}

	public void vocalize() {
		System.out.println("🐳");
	}
}
