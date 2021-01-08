package com.learning.iterator;

import java.util.*;
public class Iterations {

	public static void main(String args[]) {
		
		Map<Integer,Integer> map = new HashMap<>();		//There is no iterator for map as map doesn't extend Iterator interface
		map.put(5, 6);
		map.put(7, 99);
		map.put(78, 23);
		
		List<Integer> al = new ArrayList<>();
		al.add(87);
		al.add(78);
		al.add(79);
		
		
		
		List<Integer> ll = new LinkedList<>();
		ll.add(7);
		ll.add(78);
		ll.add(788);
		
		Set<Integer> hs = new HashSet<>();
		hs.add(87);
		hs.add(98);
		hs.add(798);

		System.out.println("The Array List contains :");
		Iterator<Integer> ai = al.iterator();
		
		while(ai.hasNext())
		{
			System.out.println(ai.next());
		}

		
		System.out.println("The Linked List contains");
		Iterator<Integer> li = ll.iterator();
//		li.equals(obj)
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		

		System.out.println("The Set contains: ");
		Iterator<Integer> si = hs.iterator();
		while(si.hasNext())
			System.out.println(si.next());
	}
}
