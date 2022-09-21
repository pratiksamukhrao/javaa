package com.java.day14;
import java.util.Scanner;
public class MobileFrequency 
{
	public static void main(String[] args)
	{
	   //Scanner sc=new Scanner(System.in);
	   //int num=sc.nextInt();
	  int num=112;
	   int a,rem,b,c;
	   int count=0;
	   while(num>=0)//112
	   {
		 rem=num%10;//2
		 a=rem;//a=2
		 if(a==rem)
		 {
			 count++;//a==1
			 System.out.println(a+" "+ count);//a==1
		 }
		  num=num/10;//112
		  while(num>=0)//1
		  {
			  rem=num%10;//1
			  b=rem;//
			  if(b==rem)//b==1;
			  {
				  count++;//b=1
				  System.out.println(b+" "+count);
			  }
			  num=num/10;
			  while(num>=0)//1
			  {
				  rem=num%10;//1
				  c=rem;//1
				  if(c==rem)//1
				  {
					  count++;//2
					  System.out.println(c+" "+count);
				  }
				  num=num/10;
			  }
		  }
		
		
		
		 
	   }

	}

}
