package com.learning.streams;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CharacterStream {

	public static void main(String[] args) {


		char[] arr = new char[100];
		String str;
		Scanner scan = new Scanner(System.in);
		File file = new File("text.txt");
		
		try 
		{
			FileReader fr = new FileReader(file);
			FileWriter fw = new FileWriter(file,true);	//
			
			if(!file.exists())
				file.createNewFile();
		
			System.out.println("Enter the data to be written on the file");
			str = scan.nextLine();
			fw.write("\n"+str);					//Instead of rewriting the whole file. This will append the string at the end of the file
												//Error: While reading, the current written data is not read
			
			fr.read(arr);
			System.out.println("The data in the File is : \n" + new String(arr));
			
			
			fr.close();
			fw.close();
			scan.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	

	}

}
