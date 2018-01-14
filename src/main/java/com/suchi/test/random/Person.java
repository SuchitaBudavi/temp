package com.suchi.test.random;

public class Person {

	public String name;
	public String lastName;
	public int age;
	public static int test;
	
	public static void printPerson(){
		System.out.println("In static method of Person");
	}
	
	public Person() {		
		super();
		test = 100;
	}

	public Person(String name, String lastName, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		test = 100;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	
}
