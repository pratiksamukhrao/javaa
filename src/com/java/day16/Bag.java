package com.java.day16;
class Pen
{
	private int prize;
	private String bname;
	private String color;
	public void set(int prize)
	{
		this.prize=prize;
	}
	public void setb(String bname)
	{
		this.bname=bname;
	}
	public void setc(String color)
	{
		this.color=color;
	}
    public int get()
    {
    	return prize;
    }
    public String getb()
    {
    	return bname;
    }
    public String getc()
    {
    	return color;
    }
}
public class Bag 
{
 private String brand;
 private String name;
 private int prize;
 Pen p;
private Object getpp;
 public void setbb(String brand)
{
	 this.brand=brand;
}
 public void setn(String name)
 {
	 this.name=name;
 }
 public void setp(int prize)
 {
	 this.prize=prize;
 }
 public void setpp(Pen p)
 {
	 this.p=p;
 }
 public String getb()
 {
	 return brand;
 }
 public String getn()
 {
	 return name;
 }
 public int geti()
 {
	 return prize;
 }
 public Pen getpp()
 {
	 return p;
 }
 public static void main(String[] args)
{
   /* Pen p=new Pen();
    p.set(200);
    p.setb("ball");
    p.setc("blue");
    System.out.println(p.get());
    System.out.println(p.getb());
    System.out.println(p.getc());*/
    Bag b=new Bag();
    b.setbb("shaiipen");
    b.setn("black");
    b.setp(10);
    b.setpp(new Pen());
    // b.getpp.set(200);
     //b.getpp.setb("ball");
     //b.getpp.setc("blue");
    System.out.println(b.getb());
    System.out.println(b.geti());
    System.out.println(b.getn());
}

}
