package com.java.day20;

abstract class Set 
{
	Set(int a)
	{
		System.out.println("java code"+a);
	}
	abstract void m1();
}
class Test extends Set
{
	Test()
	{
		super(10);
	}
	public void m1()
	{
		System.out.println("python  code");
	}
	
	public static void main(String[] args)
	{
		Test t=new Test();
		t.m1();
    }

}
