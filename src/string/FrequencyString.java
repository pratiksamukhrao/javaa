package string;

import java.util.Scanner;

public class FrequencyString
{
	public static void word(String a)
	{
		String[]s=a.split("\\s");
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			count=1;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(s[i].equals(s[k]))
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited==false)
			{
				for(int j=i+1;j<s.length;j++)
				{
					if(s[i].equals(s[j]))
					{
		      				count++;
					}
				}
			}
			if(isvisited==false)
			{
				System.out.println(s[i]+"="+count);
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		FrequencyString.word(str);
		// TODO Auto-generated method stub

	}

}
