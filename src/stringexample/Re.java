package stringexample;

import java.util.Scanner;

public class Re 
{
	public void revers(String str)
	{
		String s2="";
		int len=str.length()-1;
		for(int i=len;i>=0;i--)
		{
			s2=s2+str.charAt(i);
		}
		System.out.println(s2);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.nextLine();
		Re e=new Re();
		e.revers(s1);
		// TODO Auto-generated method stub

	}

}
