
public class Test1 
{
	int a=10;//instance var

	public static void main(String[] args)
	{
		Test1 b=new Test1();
		b.a=20;
		Test1.a=20;
		System.out.println(a);
		// TODO Auto-generated method stub

	}

}
