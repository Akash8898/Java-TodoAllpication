package com.kata;



public class SumOfSquare {
	public static int squareSum(int[] n)
	{ 
		
		int ret=0;
		for(int i : n)
			ret+=(i*i);
		return ret;
		
	 //Your Code
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(squareSum(new int[] {1,2,2}));
		System.out.println(squareSum(new int[] {1,2}));
		System.out.println(squareSum(new int[] {5,-3,4}));
		
	}

}
