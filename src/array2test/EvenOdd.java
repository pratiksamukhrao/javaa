package array2test;

import java.util.Arrays;

public class EvenOdd {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12};
		int count=0;
		int i,j=0;
		for( i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				a[count]=a[i];
				count++;
			}
			else
			{
				
				
			}
			
			
			
			
		}
		System.out.println(Arrays.toString(a));
		
		

	}

}
