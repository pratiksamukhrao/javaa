package Test;

public class MatrixAvg {

	public static void main(String[] args)
	{
		int arr[][]= {{2,4,6,3},{7,3,5,8},{8,6,4,3}};
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum=sum+arr[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.print(" = "+sum+" average is "+sum/4);
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
