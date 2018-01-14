package com.suchi.test.random;

public class Employee extends Person{

	public String empNo;
	public int salary;
	
	public Employee() {
		super();
	}

	public Employee(String name, String lastName, int age,String empNo, int salary) {
		super(name,lastName,age);
		this.empNo = empNo;
		this.salary = salary;
		test = 1000;		
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", salary=" + salary + ", name=" + name + ", lastName=" + lastName
				+ ", age=" + age + "]";
	}
	
	public void printSalary(){
		System.out.println(name+"'s salary is: "+salary+" thousand rupee");
	}
		
}
