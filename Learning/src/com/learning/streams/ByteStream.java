package com.learning.streams;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ByteStream {

	@SuppressWarnings("deprecation")
	public static void main(String args[]){

		String str;
		Scanner scan = new Scanner(System.in);
		File file = new File("text.txt");
		
		try 
		{
			if(!file.exists())
				file.createNewFile();
			
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos =  new DataOutputStream(fos);
			FileInputStream fin = new FileInputStream(file);										//Since the same stream can not be used more than once
			FileInputStream fin2 = new FileInputStream(file);										//a new Input stream is created for the buffered reader
			
			DataInputStream din = new DataInputStream(fin);
			BufferedReader br = new BufferedReader(new InputStreamReader(fin2));
			
			System.out.println("Enter the data to be written in the file");
			str = scan.nextLine();
			dos.writeChars(str);
		
			System.out.println("The data in the File is");
		
			System.out.println("Using the deprecated readline in DIS \n" + din.readLine());				//Sometime The bytes are not properly converted to char properly
			System.out.println("Using the readline methord  in Buffered reader \n" + br.readLine());	//So the use of buffered reader is suggested
		
			
			scan.close();
			dos.close();
			din.close();
			br.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
