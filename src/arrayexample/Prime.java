package arrayexample;
import java.util.Scanner;
public class Prime
{
	public static boolean isPrime(int n)
	{
		boolean isPrime=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isPrime=true;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)
        {
        	a[i]=sc.nextInt();
        			
        }
		for(int i=0;i<a.length;i++)
		{
			if(isPrime(a[i]))
			{
				System.out.println(a[i]);
			}
		}
		// TODO Auto-generated method stub

	}

}
