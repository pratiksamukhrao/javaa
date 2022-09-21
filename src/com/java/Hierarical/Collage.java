package com.java.Hierarical;

public class Collage
{
	int teacher;
	int student;
}
class Departemet extends Collage
{
	int teacher=10;
	int student=100;
	void dept()
	{
		System.out.println(teacher+""+student);
	}
}	
	
class Teacher extends Departemet
{
	  int teacher=20;
	  int student=200;
	  void m1()
	  {
		  System.out.println(teacher+""+student);
	  }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Teacher t=new Teacher();
        t.dept();
        t.m1();
        
	}
}

