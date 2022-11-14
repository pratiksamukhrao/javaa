package stringexample;

public class Revers
{
	public static void revers(String s1)
	{
        String s2=" ";
		for(int i=0;i<s1.length();i++)
		{
			//String s2=" ";
			s2=s1.charAt(i)+s2;
			//s2=s2+s1.charAt(i);
			//System.out.println(s2);//s2 is local variable
		}
		System.out.println(s2);//s2 is local variable
		
		
	}

	public static void main(String[] args)
	{
		String str="pratik samukhrao";
		Revers.revers(str);
		
		// TODO Auto-generated method stub

	}

}
