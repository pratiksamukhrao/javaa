package com.javaa;

public class Child 
{
	protected Child(int a,int b)
	{
		System.out.println(a+b);
	}
}
class Larent extends Child
{
    Larent()
	{
		super(10,20);
		System.out.println("bye");
	}
	public static void main(String[] args)
	{
		Larent p=new Larent();
		
		// TODO Auto-generated method stub

	}

}
