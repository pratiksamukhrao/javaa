
public class FibonacciSeries 
{
	int n3,n1,n2;
	public int  fiboo(int n1,int n2)
	{
		for(int i=2;i<=10;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		return n3;
		
	}
    public static void main(String[] args)
    {
    	FibonacciSeries f=new FibonacciSeries();
    	int b=f.fiboo(0,1);       
    	System.out.println(b);
		// TODO Auto-generated method stub

	}

}
