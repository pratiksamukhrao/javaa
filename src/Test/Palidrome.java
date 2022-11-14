package Test;

import java.util.Scanner;



public class Palidrome {

	public static void drome(String st)
	{
		StringBuffer b=new StringBuffer(st);
		b.reverse();
		String s=b.toString();
		if(st.equals(s))
		{
			System.out.println("palidrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		Palidrome.drome(str);
		// TODO Auto-generated method stub

	}

}
