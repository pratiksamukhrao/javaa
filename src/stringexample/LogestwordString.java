package stringexample;

public class LogestwordString {

	public static void main(String[] args)
	{
		String str="pratik shankar samukhrao";
		
		String[]ch=str.split("\\s");
		int count=0;
	    char[]ch1=str.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
	       //System.out.println(ch[i]);
			if(ch1[i]>='a'&& ch1[i]<='z')
			{
				count++;
			}
		    //System.out.println(count);
			
		}
		System.out.println(count);
		
		
	}

}