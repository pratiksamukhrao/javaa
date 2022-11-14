package string;
import java.util.Scanner;
public class ReverseString
{
	public static String reverse(String str)
	{
		String s1=" ";
		
		for(int i=0;i<str.length();i++)
		{
			s1=str.charAt(i)+s1;
					
		}
		return s1;
	
	
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string");
		String str=sc.next();
		System.out.println(ReverseString.reverse(str));
		
		
	}
}