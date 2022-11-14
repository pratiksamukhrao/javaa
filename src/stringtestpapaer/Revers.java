package stringtestpapaer;
import java.util.Scanner;
public class Revers {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		// TODO Auto-generated method stub

	}

}
