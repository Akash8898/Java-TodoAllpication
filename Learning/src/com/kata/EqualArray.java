package com.kata;

public class EqualArray {

	public static boolean comp(int[] a , int[] b)
	{
		if(a.length!=b.length)
			return false;
		
		int suma = 0,sumb = 0;
		for(int i =0 ; i<a.length ; i++)
		{
			a[i]=a[i]*a[i];
			suma+=a[i];
			sumb+=b[i];
		}
		if(suma==sumb)
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {

		/* The job is to return true if we square every element array a,
		 *  it is in b array regardless of the order */
	
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
		System.out.println(comp(a, b)); 
	
	
	}

}
