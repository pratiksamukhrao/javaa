package stringtestpapaer;

public class Pattern 
{
	public static void main(String ars[])
	{
		String str="india is my country";
		str=str.replace("i", "@");
		String s1[]=str.split("\\s");
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s1[j]+" ");
			}
			System.out.println();
		}
	}
}
