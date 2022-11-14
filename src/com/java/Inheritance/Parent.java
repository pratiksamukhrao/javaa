package com.java.Inheritance;

public class Parent
{
	void m1()
	{
		System.out.println("parent m1 method");
	}
}
class Child extends Parent
{
	void m2()
	{
		System.out.println("child m2 method");
	}
    public static void main(String[] args)
    {
    	Parent p=new Parent();
    	p.m1();
    	p.m2();//in parent class m2 method is not present 
		// TODO Auto-generated method stub

	}

}
