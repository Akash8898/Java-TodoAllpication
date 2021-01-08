package com.learning.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(78);
		ar.add(45);
		ar.add(956);
		ar.add(724);
		
		Consumer<Integer> method = (n)->{
			int a = 10;									//Block of the function where anything an occur
			int b = 23;
			int c = a+b;
			System.out.println(c);
			System.out.println("The Value is: "+n);
			};	//using Consumer Interface to store the lambda in a variable
		ar.forEach(method);
	}

}
