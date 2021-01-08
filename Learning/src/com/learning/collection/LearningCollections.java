package com.learning.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
public class LearningCollections {
	

										
	public static Map<String,String> map = new HashMap<>();
	public static Map<String,String> map1 = new TreeMap<>();
	public static Map<String,String> map2 = new Hashtable<>();		//what is hashing
	public static Map<String,String> map3 = new LinkedHashMap<>();
	
	public static List<Integer> list = new ArrayList<>();					//method in all the classes
	public static List<Integer> list1 = new LinkedList<>();
	public static List<Integer> list2 = new Vector<>();			//memory
	public static Set<Integer> set = new HashSet<>();
	public static Set<Integer> set2 = new TreeSet<>();
	
	static
	{
		System.out.println("Hello");
	}
	
	public static void main(String args[]) {
		

		map.put("b", "bravo");
		map.put("a", "alpha");
		map.put("d", "delta");
		map.put("c", "charlie");
		map.put("e", "echo");
		map.put("f", "foxtrot");
		map.put("g", "golf");
		map1.putAll(map);
		map2.putAll(map);
		map3.putAll(map);
		
		list.add(5);
		list.add(6);
		list.add(4);
		list.add(59);
		list.add(57);
		list.add(596);
//		list.add(null);
		list1.addAll(list);
		list2.addAll(list1);
		
		set.add(5);
		set.add(6);
		set.add(4);
		set.add(59);
		set.add(57);
		set.add(596);
		set2.addAll(list);
		

		System.out.println(map + "\tHash Map");
		System.out.println(map1 + "\tTreeMap");
		System.out.println(map2 + "\tHash Table");
		System.out.println(map3 + "\tLinked Hash Map");
		
		System.out.println(list1 + "\tArray List");
		System.out.println(list+ "\tLinked List");
		System.out.println(list2 + "\tVector");
		
		

		System.out.println(set + "\tHash Set");
		System.out.println(set2 + "\tTree Set");
		
		System.out.println("after manuplation in linked list");
		list2.add(3, 78445);
		System.out.println(list2);
		list.add(3, 78445);
		System.out.println(list2);
		list1.add(3, 78445);
		System.out.println(list2);
		
		
	}
}
