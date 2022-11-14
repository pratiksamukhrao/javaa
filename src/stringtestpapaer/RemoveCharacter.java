package stringtestpapaer;
import java.util.Scanner;
public class RemoveCharacter {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first string");
		String s1=sc.nextLine();
		System.out.println("enter second string");
		String s2=sc.nextLine();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			int count=0;
			for(int j=0;j<c2.length;j++)
			{
				if(c1[i]==c2[j])
				{
					count++;
				}
				
			}
			if(count==0)
			{
				System.out.println(c1[i]);
			}
		}
  		// TODO Auto-generated method stub

	}

}
