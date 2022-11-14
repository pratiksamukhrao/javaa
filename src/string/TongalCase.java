package string;
import java.util.Scanner;
public class TongalCase
{
	public static void covert_string(String str)
	{                                                                                                    
		String word=""; 
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a'&&str.charAt(i)<='z')//upper to lower lower to upper case
			{
				word=word+(char)(str.charAt(i)-32);
			}
			else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
			{
				word=word+(char)(str.charAt(i)+32);
						
			}
			else
			{
				word=word+str.charAt(i);
			}
		}
		System.out.println(word);
	   
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.nextLine();
		TongalCase.covert_string(s1);
		// TODO Auto-generated method stub

	}

}
