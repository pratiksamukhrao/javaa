package com.java.day21;

import java.util.Scanner;

public class ArrSum 
{
	static int m1(int[] a)
	{
		
		int sum=0;
		int count=0;
		for(int i=2;i<a.length;i++)
		{
			boolean isprime=true;
			for(int j=2;j<a[i];i++)
			{
				if(a[i]%j==0)
				{
					isprime=false;
					count++;
					break;
				}
			}
			if(isprime==false)
			{
				sum=sum+a[i];
			}
		}
		int average=sum/count;
		return average;
	}
	public static void main(String args[])
	{
		int[]a=new int[10];
		Scanner sc=new Scanner(System.in);
		int average;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	    
		
	}


}
