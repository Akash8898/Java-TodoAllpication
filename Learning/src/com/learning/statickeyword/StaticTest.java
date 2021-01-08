package com.learning.statickeyword;

public class StaticTest {

	int a,b;
	static int var ;
	static void display() {
		System.out.println("Hello");
		
	}
	
	public static void main(String args[]) {
		
//		static int x;			//Static can be used only in class level and not in method
		StaticTest obj = new StaticTest();
		StaticTest obj2 = new StaticTest();
		obj.a = 23;
		obj.b = 34;
		StaticTest.var=85;
		obj.display();			//Warning as the static method and variable is accessed with the object
		System.out.println(obj.a+"\t"+obj.b+"\t"+var);
		obj2.a = 44;
		obj2.b = 22;
		obj2.var=81;
		StaticTest.display();	//No Warning as the static methord is accessed with the class name directly without object
		System.out.println(obj.a+"\t"+obj.b+"\t"+var);
		
	}
	
}
