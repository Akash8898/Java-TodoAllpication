package com.learning.interfaces;

import java.util.HashSet;
import java.util.Set;

public class Class1 implements Source2{

	Set<String> obj = new HashSet<>();
	
	
	public static void main(String args[]) {
		
		int a = 23;
		switch(a)
		{
		case 1 : System.out.print(a);break;
		case 23: System.out.println("the value is 23");break;
		default: System.out.println("continued");
		
		}
		
	}

	@Override
	public void get() {							//From the Interface Source
		// TODO Auto-generated method stub
		
	}

	@Override
	public void put() {							//From the Interface Source
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {							//From the Interface Source2
		// TODO Auto-generated method stub
		
	}
}
