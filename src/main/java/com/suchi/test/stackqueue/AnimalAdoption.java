package com.suchi.test.stackqueue;

import java.util.Iterator;
import java.util.LinkedList;

public class AnimalAdoption {

	class Animal{
		String animalType;
		int order;
		
		@Override
		public String toString() {
			return "Animal [animalType=" + animalType + ", order=" + order + "]";
		}
	}		
	enum AnimalType{
		DOG,CAT
	}
	int globalCounter = 1;
	
	LinkedList<Animal> dogQ = new LinkedList<Animal>();
	LinkedList<Animal> catQ = new LinkedList<Animal>();
		
	//enqueue
	void enqueue(String animalType){
		Animal a = new Animal();
		a.order = globalCounter++;
		a.animalType = animalType;
		if(animalType.equalsIgnoreCase(AnimalType.DOG.toString())){			
			dogQ.add(a);
		}else if(animalType.equalsIgnoreCase(AnimalType.CAT.toString())){
			catQ.add(a);
		}
	}
	//dequeueAny
	Animal dequeueAny(){
		if(dogQ.peekFirst().order < catQ.peekFirst().order){
			return dogQ.removeFirst();
		}else{
			return catQ.removeFirst();
		}
	}
	
	//dequeueDog
	Animal dequeueDog(){
		return dogQ.removeFirst();
	}
	
	//dequeueCat
	Animal dequeueCat(){
		return catQ.removeFirst();
	}
	
	//print
	void print(){
		System.out.println("Dog queue");
		for (Iterator iterator = dogQ.iterator(); iterator.hasNext();) {
			Animal animal = (Animal) iterator.next();
			System.out.println(animal);
		}
		System.out.println("Cat queue");
		for (Iterator iterator = catQ.iterator(); iterator.hasNext();) {
			Animal animal = (Animal) iterator.next();
			System.out.println(animal);
		}
	}
}
