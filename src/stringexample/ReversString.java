package stringexample;

public class ReversString {

	public static void main(String[] args)
	{
		String str="i like india india is big country";
		String s1=" ";
		char[]ch=str.toCharArray();
		int len=ch.length;
		for(int i=len-1;i>=0;i--)
		{
			s1=s1+ch[i];
		}
		System.out.println(s1);
		/*String []s1= {"i","love","india","india","is","big","country"};
		int len=s1.length;
	    for(int i=0;i<len;i++)
	    {
	    	
	    	
	    }*/
	    	
	}

}
