package com.java.day21;

public class frequency {

	public static void main(String[] args) 
	{
		int a[]= {1,2,2,3,4,2,1};
		int count=0;
		int i;
		for( i=0;i<a.length;i++)
		{
			//int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					
					
				}
			}
			
		
		}
		if(count==0)
		{
			System.out.println(a[i]);
		}
	
		//System.out.println(count);
		
	}

}
