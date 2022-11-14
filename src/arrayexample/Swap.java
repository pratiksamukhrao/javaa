package arrayexample;
import java.util.Scanner;
import java.util.Arrays;

public class Swap {

	public static void main(String[] args)
	{
		int []a= {1,5,3,4,5,7,8};
		//Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			
			
			int temp;
			for(int j=1;j<a.length-1;j++)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				
			}
		}
		System.out.println(Arrays.toString(a));
		// TODO Auto-generated method stub

	}

}
