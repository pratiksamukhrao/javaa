package com.java.Multilevel;

public class Library 
{
	String bname;
	int bprize;
}
class book extends Library
{
	void read()
	{
		System.out.println(bname+""+bprize);
	}
}
class Page extends book
{
	void chapter()
	{
		System.out.println("book reading is very good");
	}
	//System.out.println("book reading is very good");

	public static void main(String[] args) 
	{
		Page p=new Page();
		p.bname="java";
		p.bprize=50000;
		p.read();
		p.chapter();
				
		// TODO Auto-generated method stub

	}

}
