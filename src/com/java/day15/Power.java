package com.java.day15;
import java.util.Scanner;
public class Power 
{
	public static void main(String[] args) 
	{
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("base");
		//int base=sc.nextInt();
		//System.out.println("power");
		//int power=sc.nextInt();
		//.out.println("number");
		//int num=sc.nextInt();
		int ans=1;
		for(int i=1;i<=10;i++)
		{
			for(int j=2;i<=10;j++)
			{
				 ans=j*ans;
			}
			System.out.println(ans);
			
			// ans=base*ans;
			 /*if(ans==num)
			 {
				System.out.println("power of 3");
			 }
			 else
			 {
				 continue;
			
			 }*/
			
	    }
		//System.out.println(ans);
		
	    
	}

}
