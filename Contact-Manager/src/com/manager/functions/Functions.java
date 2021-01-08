package com.manager.functions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Functions {

	public static File file = new File("Contact.txt");

public static void write(String name, String email, long contact) throws IOException {
	// TODO Auto-generated method stub
	
		

}

private static String format(Long contact) {
	return null;
	
}

public static void view() {
	// TODO Auto-generated method stub
	
}

public static void search(String key) {
	// TODO Auto-generated method stub
	
}

public static void export() {
	// TODO Auto-generated method stub
	
}

public void useless() throws IOException
{
	File file = new File("tester.txt");
	FileReader fr = new FileReader(file);
	char[] target = new char[(int)file.length()];
	fr.read(target);
	String str = new String(target);
	String[] strA = str.split(";");
	ArrayList<String> al =new ArrayList<>();
	for(String s: strA)
		al.add(s);
	
	for(String s: al)
		if(s.contains("aka"))
			System.out.println(s);
}

}
