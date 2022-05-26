package com.hestervending.vendingmachine;

public class Person {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return String.format("Name: %s, Age: %x", this.name, this.age);
	}
}