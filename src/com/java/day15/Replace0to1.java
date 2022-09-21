package com.java.day15;

public class Replace0to1 
{

	public static void main(String[] args)
	{
		int num=412034;
		int rem;
		while(num!=0)
		{
			rem=num%10;
			/*int a=rem;
			if(a==0)
			{
				a++;
				//a=0;
			}*/
			  if(rem==0)
			  {
				  rem++;
				  System.out.println(rem);
			  }
			 num=num/10;
			 
		}
		
		
		// TODO Auto-generated method stub

	}

}
