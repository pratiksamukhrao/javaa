package com.java.day21;
import java.util.*;
public class Arary1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			System.out.println(a[i]);//print the arry without intilization we get null value as 0
		}
		int []c= {1,2,3,4,5,6,7,8,9,10};
	     for(int i=0;i<c.length;i++)
	     {
	         System.out.println(c[i]);
	     }
		
		

	}

}
