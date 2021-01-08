package com.learning.classes;

public class TrialStaticClass {
	public static class InnerClass{			//Only the inner class can be a static class. The outer class can't be a static class
		public  static void display() {
			System.out.println("Printing the lines ");
		}
		
	public static void main(String args[]) {
//		InnerClass ic = new InnerClass();
		InnerClass.display();				//If the function is static no object created. if the method is non- static and object is required
	}
	}
}
