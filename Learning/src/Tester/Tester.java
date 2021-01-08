package Tester;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Tester {

	
	public static void main(String args[]) throws IOException {

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
			
//		System.out.println(al);
		
		
}
}