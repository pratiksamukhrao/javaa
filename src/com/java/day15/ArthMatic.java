package com.java.day15;

public class ArthMatic
{
	public int disp1(int a,int b)
	{
		return  a+b;
	}
	public float disp1(int c, float d)
	{
		return c-d;
	}
	public void disp1(float f,double e)
	{
		System.out.println("multiplication "+e*f);
	}
	public double disp1(double g, float h)
	{
		return g/h;
		
	}
	public static void main(String[] args) 
	{
		ArthMatic a=new ArthMatic();
		System.out.println("addition "+a.disp1(10,20));
		System.out.println("subtraction "+a.disp1(30,20f));
		a.disp1(10f,100.0);
		System.out.println("division "+a.disp1(250,25f));
		// TODO Auto-generated method stub

	}

}
