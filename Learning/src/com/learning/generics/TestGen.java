package com.learning.generics;

public class TestGen<T> {

	T obj;
	public TestGen(T object) 
	{
		obj=object;
	}
	public T getobject()
	{
		return obj;
	}
	
	public void showtype()
	{
		System.out.println("The type of the object is " + obj.getClass().getName());
	}
}
