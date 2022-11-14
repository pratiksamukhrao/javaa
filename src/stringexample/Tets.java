package stringexample;
import java.util.Scanner;
public class Tets 
{
	public static void count(String s2)
	{
		int count=0;
		char[] ch=s2.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
			{
				count++;
			}
		
		}
		System.out.println(count);
		
	}

	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
        String s1=sc.nextLine();
        Tets.count(s1);
	}

}
