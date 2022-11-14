package string;
import java.util.Scanner;
public class SumofDigit
{
	public static void sumof(String s1)
	{
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				//System.out.println(ch);
				int x=Character.getNumericValue(ch);
				sum=sum+x;
				
			}
			//System.out.println(sum);
			
		}
		System.out.println(sum);

	
	}	
		// TODO Auto-generated method stub
       public static void main(String args[])
       {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("enter your string");
    	   String str=sc.next();
    	   SumofDigit.sumof(str);
    	   
    	   
       }
	}


