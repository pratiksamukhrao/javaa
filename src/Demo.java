interface Client
{
    /*void add()//concrete method invalid
	{
		int a,b;
		System.out.println(a+b);
	}*/
	void add();
	//abstract void disp();//abstract method invalid
	
	/*void m1()//instance method invalid
	{
		System.out.println("m1 method");
	}*/
	static void m2()//we use only static method in interface valid
	{
		System.out.println("static method");
	}
	int a=10;
	public static final int b=10;
}
abstract class Customer implements Client
{
	public void m3()
	{
		System.out.println("abstract m3 method");
	}
}
public class Demo extends Customer implements Client
{
	public void add()
	{
		System.out.println("add method");
	}
	public void m1()
	{
		System.out.println("m1 method");
	}
	
    public static void main(String[] args) 
    {
    	Demo m=new Demo();
    	m.m1();
    	m.m3();
    	m.add();
    	System.out.println(Demo.m2());
		// TODO Auto-generated method stub
    }
 }
