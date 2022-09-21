package com.java.day16;
class Engi
{
	String etype;
	Engi(String etype)
	{
		this.etype=etype;
	}
	void show()
	{
		System.out.println(etype);
	}
}
public class Carr 
{
	int model;
	String name;
	float prize;
	Engi e;
	Carr(int model,String name,float prize,Engi e)
	{
      this.model=model;
      this.name=name;
      this.prize=prize;
      this.e=e;
	}
	void disp()
	{
		System.out.println(model+" "+name+" "+prize);
		e.show();
	}

	public static void main(String[] args) 
	{
		Engi e=new Engi("automatic");
		Carr c=new Carr(946412, "audii", 3000000f, e);
		c.disp();
		// TODO Auto-generated method stub
	}

}
