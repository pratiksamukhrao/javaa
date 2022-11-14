package com.java.ay19;
public class Test2
{
	final int a;
	public void m1(int a)//use of method and instance we cannot reassing the value final
	{
		this.a=a;//not applicable for final to reassing
	}
	void m2()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
       Test2 t=new Test2();
       t.m1(10);
       t.m2();
	}
			
}