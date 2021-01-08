package com.learning.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LearningMap {

	/* When a Interface is implemented by a class it is mandatory that the class must define all the methods in the Interface
	 * (What I understood) The Map is a under collection concept, but as the collection Interface has a lot of methods that are unnecessary in the map,
	 * Map doesn't extends the collection Interface. Some Methods form the Collection class can be used for a map */
	
	
	public Map<String,String> map = new HashMap<>();
	public static void main(String args[]) {
		LearningMap obj = new LearningMap();
		obj.map.put("hai", "Hello");				//e.g The same method to add data in collection interface is add(object)
		obj.map.put("hello", "Hai");
		obj.map.put("welcome", "new");
		System.out.println(obj.map.values());
		System.out.println(obj.map.keySet());

		Map<Integer,Integer> m2 = Collections.emptyMap();
//		Map<Integer,Integer> m = Collections.EMPTY_MAP;
		m2.put(87, 88);
		System.out.println("\t" + m2);

	}
	
}
