package Array_Test;

import java.rmi.MarshalException;

class Nib
{
	private String materialType;
	private int width;
	void setmaterial(String materialType)
	{
		this.materialType=materialType;
	}
	void Setwidth(int width)
	{
		this.width=width;
	}
	public void setwidth(int w)
	{
		this.width=w;
	}
	public String getmaterialtype()
	{
		return materialType;
	}
	
}
class Refile
{
	private String inkcolor;
	private int length;
	Nib tip;
	void setinkcolor(String inkcolor)
	{
		this.inkcolor=inkcolor;
	}
	void setlength(int length)
	{
		this.length=length;
	}
	public void setnib( Nib n)
	{
		this.tip=n;
	}
	public String getInkcolor()
	{
		return inkcolor;
	}
	public int getlength()
	{
		return length;
	}
	public Nib gettip()
	{
		return tip;
	}
}
public class Pen
{
	Refile Refail;
	private int caplength;
	private String brand;
	public void setRefile(Refile r)
	{
		this.Refail=r;
	}
	public void setcaplength(int cl)
	{
		this.caplength=cl;
	}
	public void setbrand(String brand)
	{
		this.brand=brand;
	}
	public Refile getrefile()
	{
		return Refail;
	}
	public String getbrand()
	{
		return brand;
	}
	public int getcaplength()
	{
		return caplength;
	}
	public static void main(String[] args)
	{
		Pen a=new Pen();
		a.setcaplength(5);
		a.setbrand("parker");
		a.setRefile(new Refile());
		a.getrefile().setinkcolor("black");
		a.getrefile().setlength(6);
		a.Refail.setnib(new Nib());
		a.getrefile().gettip().setmaterial("stainless steel");
		System.out.println(a.getbrand()+" "+a.getcaplength()+" "+a.getrefile().getInkcolor());
		// TODO Auto-generated method stub

	}
}
