package string;
import java.util.Scanner;
public class CountChar 
{
	public static void charcount(String str)
	{
		char []ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z' || ch[i]>='A' && ch[i]<='Z')
			{//char count number
				count++;
			}
		}
		System.out.println(count);
	}
	
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter a string");
	  String s1=sc.nextLine();
	  CountChar.charcount(s1);
  }
}
