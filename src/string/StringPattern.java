package string;
import java.util.Scanner;
public class StringPattern
{
	public static void pattern(String str)
	{
		String s1[]=str.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s1[j]+" ");
			}
			System.out.println();
		}   
		
    }

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string");
		String str=sc.nextLine();
		StringPattern.pattern(str);
		
		

	}

}
