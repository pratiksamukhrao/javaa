package com.java.day16;

class Demo
{
	int a,b;
	public void add(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void disp()
	{
		System.out.println(a+b);
	}
}
public class Test 
{
	int c,d;
	Demo e;
	public void sub(int c,int d,Demo e)
	{
		this.c=c;
		this.d=d;
		this.e=e;
		
	}
	void disp1()
	{
		e.disp();
		System.out.println(c-d);
		
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.add(10,20);
		
		Test t=new Test();
		t.sub(10,30,d);
		t.disp1();
	}
	

}
