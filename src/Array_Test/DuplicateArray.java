package Array_Test;

public class DuplicateArray
{
    public static void main(String[] args)
	{
	    int [] arr={1,2,3,1,5,1,2};
		boolean isvisible=false;
			for(int i=0;i<arr.length;i++)
			{
			
			    for(int j=i+1;j<arr.length;j++)
			   { 
				   if(arr[i]==arr[j])
				  {
					System.out.println("duplicate element "+arr[i]);
					isvisible=true;
				  }
			  }
			}   
			    
		
		if(isvisible==false)
		{
			System.out.println("duplicate element not");
		}
		
		// TODO Auto-generated method stub

	}

}
