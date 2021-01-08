package com.learning.classes;
import java.util.HashMap;

import com.learning.classes.FinalClassImmutable;
public class FinalClassImmutableTest {

	public static HashMap<String,String> map = new HashMap<>();
	
	public static void main(String args[]) {
		map.put("S","s");
		map.put("H","h");
		FinalClassImmutable im = new FinalClassImmutable(34,map);
//		im.display(); //Can't be accessed as the method is private
		
	}
}
