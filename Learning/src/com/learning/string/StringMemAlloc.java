package com.learning.string;


public class StringMemAlloc {

	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		String str = "Hello";
		String str1 = "new String";
		String tester = "new string";
		String str2 = "Hello";
		String str3 = new String("Hi");
		String str4 = new String("Hi");
		String str5 = new String("Hello");
		
		
		Integer a=new Integer(3);						//Deprecated or disapproved to use by java developers
		Integer b=new Integer(3);

		System.out.println("str\t" + str.hashCode());
		System.out.println("str1\t" + str1.hashCode());
		System.out.println("tester\t" + tester.hashCode());
		System.out.println("str2\t" + str2.hashCode());
		System.out.println("str3\t" + str3.hashCode());
		System.out.println("str4\t" + str4.hashCode());
		System.out.println("str5\t" + str5.hashCode());

		System.out.println("Testing if obj = literals");
		System.out.println(str=str2);
		System.out.println(str5==str);
		System.out.println(str5.intern()==str);
		System.out.println(str3.equals(str4));			//diff of == and .equals
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		

	}
	
}
