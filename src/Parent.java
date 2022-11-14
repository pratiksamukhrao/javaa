
public class Parent
{
	void disp()
	{
		System.out.println("parent class disp method");
	}
	void display()
	{
		System.out.println("parent class display method");
	}
	static void m3()
	{
		System.out.println("parent static method");
	}
}
class child extends Parent
{
	void m1()
	{
		System.out.println("child class m1 mehtod");
	}
	void m2()
	{
		System.out.println("child class m2 method");
	}
	@Override
	static void m3()
	{
		System.out.println("child overirding");
	}
	public static void main(String[] args) 
    {
		Parent p=new child();
		p.disp();
		p.display();
		p.m1();
		p.m2();
    	Parent.m3();
    	child.m3();
    	Parent a=new Parent();
    	
		// TODO Auto-generated method stub

	}

}
