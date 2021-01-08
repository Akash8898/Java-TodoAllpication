package com.learning.string;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello. This is the first String";
		String str2 = "Hi.This is the Second string";
		String str3 = "    Hello. This is the third string     ";
		String str4 = "akash";
		String str5 = "AKASH";
		
		System.out.println(str4.equalsIgnoreCase(str5));

		int str1l = str.length();
		int str2l = str2.length();
		System.out.println(str.concat(str2));		//concatenation of two strings
		System.out.println(str + str2);
		System.out.println(str.equals(str3));		//comparison of two stings
		
		System.out.println(str.compareTo(str2));
		System.out.println(str1l-str2l);			//To check the compare value
		
		System.out.println(str.substring(3,7));		//extraction
		System.out.println("hi  "+str.replace('i', 'k')); 	//replace. This works on string too as replace("hello" , "hi")
		System.out.println(str3.trim());			//trim to reduce all blank spaces in beginning and end

		System.out.println(str3.startsWith(" "));
		System.out.println(str3.startsWith("h"));
		System.out.println(str3.startsWith("l", 7));
		
	
	
	
	}

}
