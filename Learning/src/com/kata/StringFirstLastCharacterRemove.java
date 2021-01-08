package com.kata;

public class StringFirstLastCharacterRemove {

	public static String remove(String str) {
		
//		return (str.substring(1, str.length()-1));
		return str.replaceAll("^.|.$", "");			//^ beginning of the string   . one instance   | separator     $ end of the string
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(remove("country"));;
		
	}

}
