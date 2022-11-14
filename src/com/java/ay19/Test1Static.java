package com.java.ay19;

public class Test1Static
{
	   static void m1()
	   {
		   System.out.println("m1 method");
	   }
	
}
class Test extends Test1Static//we cannot overriding the static method
{
	static void m1()
	{
		System.out.println("m1 override here");
	}
	public static void main(String[] args)
	{
		Test.m1();
		// TODO Auto-generated method stub

	}

}
