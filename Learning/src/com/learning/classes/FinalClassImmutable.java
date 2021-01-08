package com.learning.classes;

import java.util.HashMap;
import java.util.Map;

public class FinalClassImmutable {

	Map<String,String> map = new HashMap<>();
	private final int y;
	public FinalClassImmutable(int x, Map<String,String> mapin){
		this.y = x;
		this.map=mapin;
	}
	

	@SuppressWarnings("unused")
	private void display()
	{
		System.out.println(y+" \t"+map);
	}
}
