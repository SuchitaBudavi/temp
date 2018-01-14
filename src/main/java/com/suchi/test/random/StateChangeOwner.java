package com.suchi.test.random;

public class StateChangeOwner {

	public void addStateListner(StateChangeListner listner,String oldState,String newState){
		System.out.println(listner.onStateChange(oldState, newState));
		System.out.println("in addStateListner");
	};
}
