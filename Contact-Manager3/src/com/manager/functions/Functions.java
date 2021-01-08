package com.manager.functions;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Functions {

	public static void view(File file) throws IOException {
		// TODO Auto-generated method stub
		char[] target = new char[(int) (file.length())];
		FileReader fr = new FileReader(file);
		fr.read(target);
		if(file.length()==0)
			System.out.println("There is no contact to display");
		else
			System.out.println(new String(target));
		fr.close();
		
		}

	public static void write(String name, String email, long contact,File file) throws IOException {
		// TODO Auto-generated method stub
		String newLine = name+"-"+email+"-"+contact+"." ;
		FileWriter fw = new FileWriter(file,true);
		fw.append(newLine + "\n");
		System.out.println("The contact has been added successfully");
		fw.close();
	}

	public static void search(String key, File file) throws IOException {
		// TODO Auto-generated method stub
		char[] target = new char[(int) (file.length())];
		FileReader fr = new FileReader(file);
		fr.read(target);
		String str = new String(target);
		String fileData[] = str.split(";");
		for(String s : fileData)
			if (s.toLowerCase().contains(key.toLowerCase())) 
				System.out.print(s);
		fr.close();
				

	}

	public static void export(File file) throws IOException {
		// TODO Auto-generated method stub
		if(file.length()==0) {
			System.out.println("Empty Phone book. No contacts to export");
		}
		else {
			String exportFilename = "Contacts";
			
			File exportFile = new File(exportFilename+".txt");
			for(int i = 1 ; i<100; i++)
				if(exportFile.exists()) {
					exportFile = new File(exportFilename+i+".txt");
				}
			
			FileReader fr = new FileReader(file);
			FileWriter fw = new FileWriter(exportFile);
			char[] target = new char[(int) (file.length())];
			fr.read(target);
			String str = new String(target);
			fw.write(str);
			System.out.println("The Contacts has been exported to your local Directory  " + exportFile.getAbsolutePath());
			fw.close();
			fr.close();
		}
	}
	}