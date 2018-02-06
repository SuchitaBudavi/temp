package com.suchi.test.random;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	enum Count{
		ONE(1),TWO(2),THREE;
		
		private int val;
		
		Count(){
			
		}
		Count(int val){
			this.val = val;
		}
		
		void print(){
			System.out.println("print from enum "+val+this);
		}
		
	}

	
	public static void main(String[] args) {	
		
	/*	System.out.println(Count.THREE);
		System.out.println(Count.ONE.val);
		Count.ONE.print();
		Count val = Count.ONE;*/
		
		/*Employee e = new Employee("suchi","budavi",27,"A1", 1000);
		System.out.println(e);
		e.printSalary();
		
		Person p = new Employee("sagar", "budavi", 31, "A2", 5000);
		System.out.println(p);*/
		//p cant access methods of e
		
		/*Employee e1 = (Employee) new Person("pooja","budavi",4000);
		System.out.println(e1);*/
		//child can not hold ref of parent object
		
/*		Person.printPerson();
		Person.test = 1001;
		Employee.test = 20001;
		Employee.printPerson();
		
		TechMEmployee techm = new TechMEmployee(){
			@Override
			public void printSalary() {
				print();
				System.out.println("from anonymous class for test");
			}
			
			public void print(){
				System.out.println("anonymous inner class with additional function");
			}
		};
		techm.printSalary();*/
		
		/*System.out.println("<---------------- Lamda expression -------------------->");
		//example 1;
		StateChangeOwner owner = new StateChangeOwner();
		owner.addStateListner(new StateChangeListner(){
			public int onStateChange(String oldState, String newState){
				System.out.println("old state: "+oldState+" new state: "+newState);
				return 1;
			}
			
		},"old","new");
		owner.addStateListner(
		(oldState,newState) -> {
			System.out.println("old state: "+oldState+" new state: "+newState);
			return 1;
		},"old","new");
		
		//example 2
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		for(Integer val:numbers){
			System.out.print(val);
		}
		numbers.forEach(value -> System.out.print(value));	
		int sum=0;		*/
		
		System.out.println("<---------------- Print pascal triangle -------------------->");
		PrintDiffTriangles printTrianglesHelper = new PrintDiffTriangles();
		printTrianglesHelper.pascalTriangle(7);
		
	}

}
