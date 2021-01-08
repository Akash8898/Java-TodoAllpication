package com.learning.classes;

public final class FinalClass {
	
	public void display() {
		System.out.println("This is working properly");
		
	}
	
	public static void main(String args[]) {
		FinalClass fc = new FinalClass();
		fc.display();							//works fine with or without an object but can't be inherited
	}

}
