package Array_Test;

public class CharFrequency {

	public static void main(String[] args)
	{
		char[] a= {'a','b','b','c','c','d'};
		int count=0;
	    for(int i=0;i<a.length;i++)
	    {
	        for(int j=i+1;j<a.length;j++)
	        {
	        	if(a[i]==a[j])
	        	{
	        		count++;
	        	}
	        }
	        if(count==2)
		    {
		    	System.out.println(a[i]);
		    }
	        
	        //System.out.println(count);
	        //System.out.println(count);
	        
	    }
	   
	    //System.out.println(a[i]+" "+count);
	    //System.out.println(count);
		
		// TODO Auto-generated method stub

	}

}
