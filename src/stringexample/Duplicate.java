package stringexample;

public class Duplicate {

	public static void main(String[] args) 
	{
		String s1="good morning";
		String s2="od";
		char[] ch=s1.toCharArray();
		char[] ch1=s2.toCharArray();
		
		
			for(int i=0;i<ch.length;i++)
			{
				int count=0;
				 for(int j=0;j<ch1.length;j++)
				 {
					// System.out.println(ch1[j]);
					 if(ch[i]==ch1[j])
					 {
						count++;
						break;
			         }
				 }
				 if(count==0)
				 {
					 System.out.println(ch[i]);
				 }
			     
			}
			
		
		
	  
	}

}
