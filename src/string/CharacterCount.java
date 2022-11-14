package string;
import java.util.Scanner;
class CharacterCount
{
	public static void charcount(String str)
	{
		int count=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{//same character count
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			
			//System.out.println(count);
			System.out.println(ch[i]+" "+ count);
		}
		//return count;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.nextLine();
		//System.out.println(CharacterCount.charcount(s1));
		CharacterCount.charcount(s1);
	}
}