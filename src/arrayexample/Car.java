package arrayexample;
class Engine
{
	int no;
	String name;
	Engine(int no,String name)
	{
		this.no=no;
		this.name=name;
	}
	public String toString()
	{
		return no+" "+name;
	}
}
public class Car 
{
	int cno;
	String cname;
	String ccolor;
	Engine e;
	Car(int cno,String cname,String ccolor,Engine e)
	{
		this.cno=cno;
		this.cname=cname;
		this.ccolor=ccolor;
		this.e=e;
	}
	public String toString()
	{
		return cno+" "+cname+" "+ccolor+" "+e;
	}

	public static void main(String[] args) 
	{
		Car[] c=new Car[3];
		c[0]=new Car(2222,"Audi","yellow",new Engine(123,"tata"));
		c[1]=new Car(5555,"nano","white",new Engine(456,"tata"));
		c[2]=new Car(4444,"santro","green",new Engine(789,"toyota"));
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		// TODO Auto-generated method stub

	}

}
