package com.java.day21;
import java.util.Scanner;
public class ReveresArray {

	public static void main(String[] args)
	{
		int[] a=new int[5];
		int num;
		int rev=0;
		int[] b=new int[5];
		Scanner sc=new Scanner(System.in);
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();
			 while(a[i]!=0)
			 {
				  b=a[i]*10+a[i]%10;
				 a[i]=a[i]/10;
				 
			 }
			 
		  }
		
		 
		

	}

}
