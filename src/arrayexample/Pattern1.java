package arrayexample;

public class Pattern1 
{
	public static void showsPattern(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(j==0||j==a.length-1)
				{
					System.out.println("*");
				}
				else if(i==j)
				{
					System.out.println("*");
				}
				else
				{
					System.out.println(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		int a[][]= {{1,5,6,4},{5,4,7,3},{4,5,3,7},{1,2,8,7}};
		Pattern1.showsPattern(a);
		// TODO Auto-generated method stub

	}

}
