package com.java.day14;

public class Test
{
	int a;
	int b;
	public void  set(int a,int b)
	{
		this.a=a;
		this.b=b;
	    for(int i=1;i<=3;i++)
	    {
	    	b=b*a;
	    }
	    if(b==3)
	    {
	    	System.out.println("true");
	    }
	    else
	    {
	    	System.out.println("false");
	    }
	  
		
	}
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.set(1,1);
		// TODO Auto-generated method stub

	}

}
