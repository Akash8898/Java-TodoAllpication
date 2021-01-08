package com.learning.SortStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main
{
    public static void main (String[] args)
    {
    	int choice;
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "Bharathi", 85));
        ar.add(new Student(131, "Akash", 20));
        ar.add(new Student(121, "Kavin", 60));
        ar.add(new Student(105,"Aakash",20));
        ar.add(new Student(155,"Mukesh",45));
        ar.add(new Student(115,"Calvin",27));
 
        
          
        while(true)
        {
        	
        	System.out.println("Select the sorting order: ");
            System.out.println("1.Unsorted\t2.Sort by roll number\t3.Sort by Name\t4.Sort by Marks\t5.Exit");
            
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
          
        	
        	switch(choice)
        	{
	        case 1:
	        	System.out.println("Unsorted");
	        	for (Student stu : ar)
	        		System.out.println(stu);
	        break;
	        
	        case 2:
	 
	        	Collections.sort(ar, new Sortbyroll());
	        	System.out.println("\nSorted by rollno");
	        	for (Student stu : ar)
	        		System.out.println(stu);
	        break;
	        
	        case 3:
	 
	        	Collections.sort(ar, new Sortbyname());
	         	System.out.println("\nSorted by name");
	        	for (int i=0; i<ar.size(); i++)
	        		System.out.println(ar.get(i));
	        break;
	        
	        case 4:
	        
	        	Collections.sort(ar, new Sortbymark());
	        	System.out.println("\nSorted by mark");
	        	for (int i=0; i<ar.size(); i++)
	        		System.out.println(ar.get(i));
	        break;
	        
	        case 5:
	        
	        	System.exit(0);
	        	scan.close();
	        break;
	        	
	        
	        default:
	        	System.out.println("Invalid Choice! Please select a valid choice to sort");
	        }
        }
    }
}
