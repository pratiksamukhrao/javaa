package Array_Test;
import java.util.*;
public class CountEO
{
	int evencount=0;
	int oddcount=0;
	int EvenCount(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evencount++;
			}
		}
		return evencount;
	}
	int oddcount(int[] b)
	{
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2!=0)
			{
				oddcount++;
			}
		}
		return oddcount;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
	    for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	    //System.out.println(arr);
		CountEO e=new CountEO();
		int result=e.EvenCount(arr);
		System.out.println("even number count "+result);
		int result1=e.oddcount(arr);
		System.out.println("odd number count "+result1);
		
		// TODO Auto-generated method stub

	}

}
