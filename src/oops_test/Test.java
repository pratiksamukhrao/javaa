package oops_test;

public class Test
{
	Test(int a,int b)
	{
		System.out.println("first contructor");
		System.out.println(a+b);
	}
	Test(float c,double d)
	{
		System.out.println("2nd contrrucor");
		System.out.println(c+d);
	}
	Test(String name,String add)
	{
		System.out.println("3rd constructor");
		System.out.println(name+add);
	}
	public static void main(String[] args) {
		Test t=new Test(10,20);
		Test t1=new Test(10.2f,10.2);
		Test t2=new Test("java","coding");
		// TODO Auto-generated method stub

	}

}
