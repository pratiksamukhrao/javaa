package com.java.day16;
class Emp
{
	int eid;
	String ename;
	Emp(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}
	void show()
	{
		System.out.println(eid+""+ename);
	}
	
}

public class Manager 
{
	String dept;
	String comp;
	Emp e;
	Manager(String dept,String comp,Emp e)
	{
		this.dept=dept;
		this.comp=comp;
		this.e=e;
		//Manager./.e=e;
	}
     void disp()
     {
    	 System.out.println(dept+""+comp);
    	 e.show();
    	 
     }
    public static void main(String[] args)
    {
    	Emp e=new Emp(111,"pratik");
    	//e.show();
    	Manager m=new Manager("math","think",e);
    	m.disp();
		// TODO Auto-generated method stub

	}

}
