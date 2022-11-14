package stringtestpapaer;
import java.util.Scanner;
public class MiddleWordRevers {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a  string");
		String str=sc.nextLine();
		String revers=" ";
		String s[]=str.split("\\s");
		System.out.println(s[0]);
		for(int i=1;i<s.length-1;i++)
		{
			String word=s[i];
			String rev=" ";
			for(int j=word.length()-1;j>=0;j--)
			{
				rev=rev+word.charAt(j);
			}
			revers=revers+rev;
		}
		System.out.println(revers);
		System.out.println(" "+s[s.length-1]);
		// TODO Auto-generated method stub

	}

}
