package com.java.day16;

public class MisingNumber {

	public static void main(String[] args)
	{
		  for(int i=1;i<=10;i++)
		  {
			  for(int j=1;j>=i;j++)
			  {
				  if(i==j)
				  {
					  continue;
				  }
				  else
				  {
					  System.out.println(j);
				  }
			  }
		  }
		

	}

}
