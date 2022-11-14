package com.java.day20;

import java.util.Scanner;

public class Merge {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[]a=new int[5];
		System.out.println("enter first array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int[] b=new int[5];
		System.out.println("enter a second element");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		int j=0;
		int k=0;
		int c[]=new int[10];
		for(int i=0;i<c.length;i++)
		{
			if(i%2==0)
			{
				c[i]=a[i];
				j++;
			}
			else
			{
				c[i]=b[i];
				k++;
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		

	}
		// TODO Auto-generated method stub

}


