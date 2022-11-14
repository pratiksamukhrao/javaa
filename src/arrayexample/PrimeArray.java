package arrayexample;
import java.util.Scanner;
public class PrimeArray
{
	public int primesum(int[] b)
	{
		int sum=0;
		for(int i=0;i<b.length;i++)
		{
			int n=b[i];
			boolean isprime=true;
			for(int j=2;j<b[i];j++)
			{
				if(n%j==0)
				{
					isprime=false;
					break;
				}
			}
			if(isprime==true)
			{
				sum=sum+b[i];
				System.out.println(b[i]);
			}
		
		}
		return sum;
	}

	public static void main(String[] args)
	{
		int[] a=new int[7];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		PrimeArray c=new PrimeArray();
		int d=c.primesum(a);
		System.out.println(d);
		
		
		
		// TODO Auto-generated method stub

	}

}
