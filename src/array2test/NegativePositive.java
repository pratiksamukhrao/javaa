package array2test;

import java.util.Arrays;

public class NegativePositive 
{
	static void rearange(int[] a)
	{
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				if(j!=i)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				j++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
	}

	public static void main(String[] args)
	{
		int[] a= {2,-3,4,-1,6,-2,-4,5,4};
		NegativePositive.rearange(a);
		
		// TODO Auto-generated method stub

	}

}
