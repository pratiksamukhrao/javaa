package stringexample;
import java.util.Scanner;
public class CharNumber
{
    public static void charcount(String s1)
   {
    	char[] ch=s1.toCharArray();
    	int count=0;
    	for(int i=0;i<ch.length;i++)
    	{
    		count++;
    	}
    	System.out.println(count);
   }
	
	
	
	
	

	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		CharNumber.charcount(str);
	}
}