package com.java.Inheritance;

public class Book 
{
	String bname="java";
	int bprize=2000;
	
	
}
class Page extends Book
{
	void read()
	{
		System.out.println(bname+"is very good subject"+"subject prize is"+bname);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       Page p=new Page();
       p.read();
	}

}
