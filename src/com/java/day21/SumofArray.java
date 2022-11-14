package com.java.day21;
import java.util.*;
public class SumofArray {

	public static void main(String[] args)
	{
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		int sum=0;
	   System.out.println("enter a element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
