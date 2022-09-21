package com.java.day16;
class Engine
{
	String etype;
	public void type(String etype)
	{
		this.etype=etype;
	}
	public void show()
	{
		 System.out.println("car engine type= "+etype);
	}
}
public class Car
{
	int model;
	String name;
	float prize;
	Engine e;
	public void carr(int model,String name,float prize,Engine e)
	{
		this.model=model;
		this.name=name;
		this.prize=prize;
		this.e=e;
	}
	public void disp()
	{
		
		System.out.println(model+" "+name+" "+prize);
		e.show();
	}
	public static void main(String[] args) {
		Engine e=new Engine();
		e.type("Automatic");
		Car c=new Car();
		c.carr(111, "swift", 800000f, e);
		c.disp();
	}
}