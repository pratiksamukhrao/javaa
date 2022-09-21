package com.java.day16;

public class Test1
{
    Test1()
	{
		System.out.println("hii");
	}
}   
class Test2 extends Test1
{
	 Test2()
	{
        super();        
		System.out.println("welcome");
	}
	void disp()
	{
		System.out.println("go back");
	}

    public static void main(String[] args)
   {
	Test2 t=new Test2();
	t.disp();
	}

}
