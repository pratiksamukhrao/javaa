package string;
import java.util.Scanner;
public class AvgCount
{
	public static void avgcount(String s1)
	{
		int sum=0;
		int count=0;
		int avg=0;
		char[]ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0'&& ch[i]<='9')
			{
				count++;
				int x=Character.getNumericValue(ch[i]);
				sum=sum+x;
				avg=sum/count;
			}
		}
		System.out.println("string sum "+sum+" Stirng count "+count+" String avg "+avg);
	}
	public static void main(String args[])
	{
		String str="p1r2a3t4i5k6";
		AvgCount.avgcount(str);
	}
	
	
}