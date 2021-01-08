package com.learning.enumeration;

import java.util.Scanner;

public class EnumerationTest {

	public static void main(String[] args) {

		int choice;
		Scanner scan = new Scanner(System.in);
		System.out.println("Select quantity");
		System.out.println("1.Small\t2.Medium\t3.Large\t4.Extra Large");					//use switch here
		choice = scan.nextInt();
		if(choice == 1)

			System.out.println(Size.SMALL);
		else if(choice == 2)

			System.out.println(Size.MEDIUM);
		else if(choice == 3)

			System.out.println(Size.LARGE);
		else if(choice == 4)

			System.out.println(Size.EXTRA_LARGE);		
		else

			System.out.println("Invalid Selection");
		scan.close();

	}

}
