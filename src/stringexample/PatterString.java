package stringexample;

public class PatterString {

	public static void main(String[] args)
	{
		String str="i love india";
		char[]ch=str.toCharArray();//convet string into character arrya;
		for(int i=ch.length-1;i>=0;i--)//revers 
		{
			for(int j=i;j>=0;j--)
			{
				System.out.print(ch[j]);
			}
			System.out.println(" ");
		}
	}
		
		
		
		// TODO Auto-generated method stub

}


