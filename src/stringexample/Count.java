package stringexample;

public class Count {

	public static void main(String[] args)
	{
		String str="pratik samukhrao";
		/*if(str.charAt(1).equals(str.charAt(13)))
		{
			
		}*/
		int count=0;
		char[]ch=str.toCharArray();//
		for(int i=0;i<ch.length;i++)
		{
	        for(int j=i+1;j<ch.length;j++)
	        {
	        	if(ch[i]==ch[j])
	        	{
	        		count++;
	        	}
	        }
		}
		System.out.println(count);
		System.out.println(str.charAt(1));
		// TODO Auto-generated method stub

	}

}
