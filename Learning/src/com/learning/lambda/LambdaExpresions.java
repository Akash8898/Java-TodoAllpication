package com.learning.lambda;

interface Addable{
	public int add(int x,int y);
}

public class LambdaExpresions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=15,b=35;
		int c = addDirect(a,b);
		System.out.println("Direct Add : " + c);
		Addable a1 = new Addable() {						//Anonymous class

			@Override
			public int add(int x, int y) {
				return x+y;
			}
			
		};
		c = a1.add(20, 42);
		System.out.println("Anonymous Class " + c);
		Addable a2 = (x,y) ->(x+y);							//Lambda Expression		//y came>? use?
		
		c=a2.add(87, 56);
		System.out.println("Lambda Expression " + c);
		 
		
	}
	public static int addDirect(int a,int b)
	{
		return a+b;
	}

}
