package com.java.ay19;

public class Test 
{
	final int disp(int a,int b)
	{
		return a+b;
	}
	 final float disp(float c,int d)
	{
		return c-d;
	}
	final double disp(double e,float f)
	{
		return e*f;
	}
	final String disp(String m,String n)
	{
		return m+n;
	}
	

	public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println(t.disp(10,20));
		System.out.println(t.disp(10.20, 10.20f));
		System.out.println(t.disp(10.30f, 50));
		System.out.println(t.disp("java", "coding"));
		// TODO Auto-generated method stub

	}

}
