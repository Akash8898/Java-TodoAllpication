package com.kata;

public class ConsecutiveString {

	
	public static String longestConsec(String[] strarr, int k) {
		String newString = new String();
		if(k==0 || strarr.length==0)
			return "";
		for(int i=k-1 ; i<strarr.length; i++)
		{
			
		}
		
		return newString;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2);
		String str2 = longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1);
		String str3 = longestConsec(new String[] {}, 3);
		String str4 = longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	
	}

}
