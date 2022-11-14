package com.java.day21;
import java.util.Scanner;
public class AvgNonPrime {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] b=new int[10];
		int i;
		boolean isprime=true;
		for( i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int j=2;j<=b[i];j++)
		{
			if(b[i]%j==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime=true)
		{
			System.out.println(isprime);
		}
			
		// TODO Auto-generated method stub

	}

}
