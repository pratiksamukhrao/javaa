package com.java.day14;
class Emp
{
	 int    eid;
	String ename;
	double esal;
	String eadd;
	  Emp(int eid, String ename,double esal,String eadd)
	{
		this.eid=eid;//first use
		this.ename=ename;
		this.esal=esal;
		this.eadd=eadd;
	}
	  Emp()
	{
		  this(101,"kiran",10000,"pune");//second use
       	System.out.println(eid+" "+ename+" "+esal+" "+eadd);
	}
}
public class ThisUse
{

	public static void main(String[] args) 
	{
		Emp t=new Emp();
	}
}
