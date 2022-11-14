package array2test;

public class RowMax {

	public static void main(String[] args) 
	{
		int arr[][]= {{22,31,9},{12,25,16}};
		int i=0;
		int max=0;
		int row=2;
		int result[]=new int[2];
		while(i<row)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			
			}
			result[i]=max;
			max=0;
			i++;
		}
		for( i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		// TODO Auto-generated method stub

	}

}
