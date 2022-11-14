package stringexample;

public class Numberseprate
{
	public static void count(String s1)
	{
		
		char ch[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
				 
				System.out.print(ch[i]+" ");
			}
			else
			{
				//System.out.println(ch[i]);
			}
			
		}
		
		
	}
	

	public static void main(String[] args)
	{
		String str="p1r2a3t4i5k6";
		Numberseprate.count(str);
		// TODO Auto-generated method stub

	}

}
