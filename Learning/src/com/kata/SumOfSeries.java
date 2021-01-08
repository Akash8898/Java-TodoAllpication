package com.kata;

/* The Series in 1,1/4,1/7,1/10,.....
 * 

*/
public class SumOfSeries {

	public static String seriesSum(int n) {
		// Happy Coding ^_^		
    double f = 0;
    int j = 4;
    for(int i = 0 ;	i<n ; i++)
      {
    	if(f==0)
    	{
    		f+=1;
    		continue;
    	}
      double x = (double) 1/j;
      f=f+x;
      j+=3;
    }

String roundOff = String.format("%.2f", f);
    
//    String str = f;
    return String.valueOf(roundOff);	
  }

	
	public static void main(String args[]) {
		System.out.println(seriesSum(74));
		System.out.println(seriesSum(27));
		System.out.println(seriesSum(22));
		System.out.println(seriesSum(0));
	}
}
