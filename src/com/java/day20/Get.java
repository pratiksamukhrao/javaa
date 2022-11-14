package com.java.day20;
abstract class Get
{
	int a=10;
	
	
}
interface  Met
{
	int b=20;
}
class Sest extends Get implements Met
{
	void m1()
	{
		int c=a+b;
		System.out.println("add "+c);
	}
	public static void main(String args[])
	{
		Sest t=new Sest();
		t.m1();
	}
}