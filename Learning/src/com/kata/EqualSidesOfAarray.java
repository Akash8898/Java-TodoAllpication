package com.kata;

public class EqualSidesOfAarray {

	public static int check(int[] arr) {
		
		int i,j,split;
		long sumi=0,sumj=0;
		if(arr.length == 0)
		  return 0;
		for(split = 0; split <arr.length-1;split++)
		{
		
			for(i=0;i<split;i++)
			{
				sumi+=arr[i];
			}
			for(j=arr.length-1;j>split;j--)
			{
				sumj+=arr[j];
			}
			if(sumi==sumj) {
				return split;
				
			}
				
			else {
				sumi=0;
				sumj=0;
				
			}
		}
		
		return -1;
	}
	public static void main(String args[]) {
		int[] arr = {444,0,123,321};
		
		System.out.println(check(arr));
	}
}
