package string;
import java.util.Scanner;
public class ReversWord 
{
	public static String reversWord(String str)
	{
		String revers=" ";
		String rev="";
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			String word=s[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				rev=rev+word.charAt(j);
				
			}
			
			rev=rev+" ";
		}
		return rev;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.next();
		System.out.println(ReversWord.reversWord(s1));
		// TODO Auto-generated method stub
	}

}
