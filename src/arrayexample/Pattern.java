package arrayexample;

public class Pattern
{

	public static void main(String[] args)
	{
		int a[][]={{1,2,3,4},{5,4,8,7},{3,4,5,7},{1,4,5,7}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
