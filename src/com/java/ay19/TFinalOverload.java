package com.java.ay19;

public class TFinalOverload 
{
	final void disp()
	{
		System.out.println("parent final mehtod");
	}

}
class Best extends TFinalOverload
{
	final void disp()//we cannot overiding the final method
	{
		System.out.println("child final method overriding");
	}
	public static void main(String[] args) {
		//Test t=new Test();
		//t.disp();
        TFinalOverload t=new TFinalOverload();
        t.disp();
	}
}
