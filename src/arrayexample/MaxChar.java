package arrayexample;

import java.util.Scanner;

public class MaxChar
{
	public static char maxChar(char ch[])
	{
		char max=ch[0];
		for(int i=0;i<ch.length;i++)
		{
			if(max<ch[i])
			{
				max=ch[i];
			}
		}
		return max;
	}

	public static void main(String[] args) 
	{
		char ch[]= {'r','t','f','h','a'};
		//System.out.println("eter the char element");
		//Scanner sc=new Scanner(System.in);
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
			//=sc.next().charAt(0);
		}
		System.out.println("max char form array== "+MaxChar.maxChar(ch));
		// TODO Auto-generated method stub

	}

}
