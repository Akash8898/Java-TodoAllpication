package com.learning.inheritance;

public class ClassDerived extends ClassBase{
	
	
	public void display(int a) {
		
		System.out.println("This function is overridden");
		
	}
	public static void main(String args[]) {
	
		ClassBase obj = new ClassBase();
		ClassDerived object = new ClassDerived();
		obj.display();
		obj.display(5); 			//over loaded
		object.display();
		object.display(7);			//object is created to access a non static method
		displayStatic();
		ClassBase.displayStatic(); 	//object created throw error and the class itself is used to access the static method
		
									//Works on both base and derived class to access the function without a object
	}

	
	
}
