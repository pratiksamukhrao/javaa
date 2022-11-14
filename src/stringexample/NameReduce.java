package stringexample;
import java.util.Scanner;
public class NameReduce
{
	public static void reduce(String s1)
	{
		String s2="";
		String s3[]=s1.split("\\s");
		for(int i=0;i<s3.length-1;i++)
		{
			s2=s2+s3[i].charAt(0)+".";
			
		}
		s2=s2+s3[s3.length-1];
		System.out.println(s2);
	
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string ");
		String str=sc.nextLine();
		NameReduce.reduce(str);
	}
}