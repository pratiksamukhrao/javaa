package com.java.day21;
import java.util.Scanner;
public class OddCountArray 
 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		System.out.println("enter a element");
		int i;
		//a[i]=sc.nextInt();
		//int[] b=new int[a]; 
		for( i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);	
			}
				
		}
		/*for(int bb:a)
		{
			System.out.println(bb);
		}*/
		
		
		// TODO Auto-generated method stub

	}

}
