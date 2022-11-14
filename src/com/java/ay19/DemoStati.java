package com.java.ay19;

import com.java.day14.Demo;

//static class DemoStati//we cannot declare class as static  
public class DemoStati
{
	
	static double a;
	static double y;
	DemoStati(int a,int y)
	{
		System.out.println(a+y);
	}
	DemoStati(float b)
	{
		this.a=a;
	}
	DemoStati(double y)
	{
		this.y=y;
	}
	static
	{
		a=10;
		y=20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(DemoStati.a+DemoStati.y);
        /*DemoStati s=new DemoStati(100,200);
        DemoStati t=new DemoStati(200.5);
        DemoStati d=new DemoStati(30.5);*/
	}

}
