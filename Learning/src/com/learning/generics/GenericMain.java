package com.learning.generics;

public class GenericMain {
	
	public <T> void display(){
		
		System.out.println("Have Fun");
		
	}

	public static void main(String args[]) {
		
		GenericMain obj = new GenericMain();
		TestGen<Integer> intgen = new TestGen<>(56);
		TestGen<String> strgen = new TestGen<>("Hello Generics");
		TestGen<Float> floatgen = new TestGen<>(56.25f);
		TestGen<Double> dblgen = new TestGen<>(56.244);
//		TestGen<Long> lnggen = new TestGen<>(8755456321);
		
//		Object objint = intgen.getobject() ;  (OR) 
//		Integer objint = intgen.getobject();
		
//		Object objstr = strgen.getobject() ;  (OR)
//		String objstr = strgen.getobject();
		
//		Object objfloat = floatgen.getobject() ;  (OR)
//		Float objfloat = floatgen.getobject();
		
//		Object objdbl = dblgen.getobject() ;   (OR)
//		Double objdbl = dblgen.getobject();
		
		System.out.println("The Integer Object "+intgen.getobject());
		intgen.showtype();
		System.out.println("The String Object "+strgen.getobject());
		strgen.showtype();
		System.out.println("The Float Object "+floatgen.getobject());
		floatgen.showtype();
		System.out.println("The Double Object "+dblgen.getobject());
		dblgen.showtype();
		
		obj.display();
	}
}
