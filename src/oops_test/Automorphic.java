package oops_test;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a start number");
		int num=sc.nextInt();
		System.out.println("enter a end number");
		int num1=sc.nextInt();
		int  n,sqr,rem=0,temp,c=0,f=0;
		while(num!=num1)
		{
			sqr=num*num;
			temp=sqr;
			n=10;
			f=0;
			while(temp!=0)
			{
				rem=sqr%n;
			
			    if(rem==num)
			    {
				f=1;
				break;
			    }
			    temp=temp/10;
			    n=n*10;
			}   
			
		
		if(f==1)
		{
			System.out.println(num+"automorphic number");
		}
		num++;
		}
				
		
		// TODO Auto-generated method stub

	}

}
