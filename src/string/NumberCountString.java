package string;
import java.util.Scanner;
public class NumberCountString 
{
	public static void countno(String str)//ki12ra3n5n4k4
	{
	   int count=0;
	   for(int i=0;i<str.length();i++)
	   {
		   char ch=str.charAt(i);//charAt based on index value get character
		   if(ch>='0'&&ch<='9')
		   {//digit count
			   int x=Character.getNumericValue(ch);//convert character into interger
			   count++;
		   }
	   }
	   System.out.println(count);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.next();//ki12ra3n5n4k4
		countno(s1);
		// TODO Auto-generated method stub

	}

}
