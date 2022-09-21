package com.java.day16;

public class OverloadStatic 
{
	public static void  disp(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void disp(int c,float d)
	{
		System.out.println(c-d);
	}
	public static void disp(float d,int e)
	{
		System.out.println(d*e);
	}
	public static void disp(float f, double g )
	{
		System.out.println(f/g);
	}

	public static void main(String[] args) 
	{
		OverloadStatic.disp(10,20);
		OverloadStatic.disp(20,25);
		OverloadStatic.disp(25f,5);
		OverloadStatic.disp(200f,5);
	 }

}
