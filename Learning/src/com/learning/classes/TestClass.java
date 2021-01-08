package com.learning.classes;

public class TestClass{

	public void display() {
		System.out.println("This is working");
		
	}
	
	public static void main(String args[]) {
		System.out.println("This is started");
		TestClass tc = new TestClass();				//method is accessed only using the object.
		tc.display();
	}
}
