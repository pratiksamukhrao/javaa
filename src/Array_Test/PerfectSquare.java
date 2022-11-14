package Array_Test;

public class PerfectSquare {

	public static void main(String[] args)
	{
		int[] arr= {3,43,25,49,12,9,78};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<=arr.length;j++)
			{
				if(arr[i]==j*j)
				{
					System.out.println(arr[i]);
				}
			}
		}
		
	}

	}


