package arrayexample;

public class SerarchArray
{
	public static search(int[] a,int n)
	{
		boolean isPresent=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				isPresent=true;
				break;
			}
		}
		return isPresent;
	}

	public static void main(String[] args)
	{
		int a[]= {4,7,2,9,1,3};
		
		// TODO Auto-generated method stub

	}

}
