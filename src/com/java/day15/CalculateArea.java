package com.java.day15;

public class CalculateArea 
{
	
	public float area(float pi,int r)
	{
		return pi*r*r;
	}
	public int area (int l,int b)
	{
		return(l*b);
	}
	public void  area(int height,int breadth,float a)
	{
		System.out.println("area od tringle "+(height*breadth)/0.5);
	}
	public static void main(String[] args)
	{
		CalculateArea ac=new  CalculateArea();
		System.out.println("area of circle "+ac.area(3.14f, 5));
		System.out.println("area of rectangle "+ac.area(20, 25));
		ac.area(20, 30, 0.5f);
	}

}       