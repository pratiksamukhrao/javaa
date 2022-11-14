package oops_test;

public class DemoOputput 
{
	int x=10;
	void assign(int x)
	{
		x=x;
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new DemoOputput().assign(100); 
	}

}
