package com.java.day21;

public class ArrayMethod 
{
	int[] m1()// method approch return type array
	{
		System.out.println("m1 method");
		int[] a= {1,2,3,4,5};
		return a;
	}

	public static void main(String[] args) 
	{
		ArrayMethod m=new ArrayMethod();
		int[] b=m.m1();
		for(int bb:b)
		{
			System.out.println(bb);
		}
		// TODO Auto-generated method stub

	}

}
