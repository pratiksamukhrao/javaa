package arrayexample;

public class SumRow 
{
	public static void Sum(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
				System.out.println(a[i][j]+" ");
			}
			System.out.println("="+sum);
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		int a[][]= {{1,5,2},{2,5,7},{4,4,6}};
		SumRow.Sum(a);
		
	}

}
