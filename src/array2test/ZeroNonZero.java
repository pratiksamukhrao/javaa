package array2test;

import java.util.Arrays;

public class ZeroNonZero
{

	public static void main(String[] args)
	{
		int a[]= {0,1,0,2,9,0,0,4,3,0};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[count]=a[i];
				count++;
			}
		}
		System.out.println(count);
		while(count<a.length)
		{
			a[count]=0;
			count++;
			
		}
		System.out.println(Arrays.toString(a));
		/*for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}*/
		
		// TODO Auto-generated method stub
       System.out.println(0!=0);
       System.out.println(1!=0);
	}

}
