package com.learning.charAtProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		Integer indexchoice,count=0 ;												//Wrapper Classes	
		Character ch;
		String str;
		
		try 
		{
			System.out.println("Enter the string");
			str = scan.nextLine().toLowerCase();
			
			System.out.println(str.length());			
			char[] charArray = str.toCharArray();
			System.out.println("Enter the index to search");
			indexchoice = scan.nextInt();												
			System.out.println("Enter the Character to search in the string");
			ch = scan.next().toLowerCase().charAt(0);			
			System.out.println(charArray[indexchoice]);								
				
			
			System.out.println("Search result for the Character \"" + ch + "\":\n");			
			for(Integer i = 0;i<charArray.length;i++)
			{
				
				if(Character.compare(charArray[i], ch) == 0) {
					if(count==0)
					{
						System.out.print("The indexes are: " + i);
						count++;
						continue;
					}
						System.out.print(", " + i );
					count++;
				}
			}
			System.out.println(".");
			if(count==0)
				System.out.println("The character " + ch + " is not available in the String");
			 
			scan.close();
		}
		catch(ArrayIndexOutOfBoundsException e)			// This will work
		{
			System.out.println("The Index searched is not found as the string is smaller");
		}
		catch(InputMismatchException e)
		{
			System.out.println("You have entered an Invalid input");
		}
	}

}