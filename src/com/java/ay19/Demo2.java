package com.java.ay19;

public class Demo2 
{
	Demo2()
	{
		System.out.println("java");
	}
}	
class Demo3 extends Demo2
{
	Demo3()
	{
		super();
		System.out.println("code");
	}
	void m2()
	{
		System.out.println("python");
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Demo3 d=new Demo3();
	}

}
