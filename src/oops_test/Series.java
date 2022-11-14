package oops_test;

import java.util.Scanner;

public class Series {

	public static void main(String[] args)
	{
	  int f=1,s=0;
	  Scanner sc=new Scanner(System.in);
	  int num=sc.nextInt();
	  for(int i=0;i<num;i++)
	  {
		  f=f+s;
		  System.out.println(f);
		  s++;
	  }
		// TODO Auto-generated method stub

	}

}
