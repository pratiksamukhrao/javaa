package com.java.day21;
import java.util.Scanner;
public class AlternativeArray {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[7];
		for(int i=0;i<a.length;i++)
		{
			 a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.println(a[i]);
		}
		
		// TODO Auto-generated method stub

	}

}
