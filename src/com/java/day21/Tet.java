package com.java.day21;

interface Runnable
{
	default void add(int a,int b)//we use default constructor
	{
		System.out.println(a+b);
	}
    void m1()//we cannot use concerete method
	{
		System.out.println("we cannot write the instance method method");
	}
}
public class Tet
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
