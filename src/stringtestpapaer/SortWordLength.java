package stringtestpapaer;
import java.util.Arrays;
import java.util.Scanner;
public class SortWordLength {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		String s[]=str.split("\\s");
		String word;
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].length()<s[j].length())
				{
					word=s[i];
					s[i]=s[j];
					s[j]=word;
					
				}						
			}
		}
		System.out.println(Arrays.toString(s));
		// TODO Auto-generated method stub

	}

}
