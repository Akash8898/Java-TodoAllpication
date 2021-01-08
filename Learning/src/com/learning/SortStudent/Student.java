package com.learning.SortStudent;

import java.util.Comparator;

class Student
{
    int rollno,Mark;
    String name;
    
    public Student(int roll)
    {
    	this.rollno = roll;
//    	 this.name = name;
//         this.Mark = mark;
    }
 
    public Student(int rollno, String name,
                               int mark)
    {
        this.rollno = rollno;
        this.name = name;
        this.Mark = mark;
    }
 
    public String toString()
    {
        return this.rollno + " " + this.name +
                           " " + this.Mark;
    }
}
 
class Sortbyroll implements Comparator<Student>
{

    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}
 
class Sortbyname implements Comparator<Student>
{

	public int compare(Student a, Student b)
    {
        return a.name.compareTo(b.name);
    }
}

class Sortbymark implements Comparator<Student>
{

	@Override
	public int compare(Student a, Student b) {
		
		return a.Mark - b.Mark;
	}
	
}
