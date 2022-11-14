package Array_Test;
import java.util.Scanner;
public class CountEvenOdd 
{
	public static void main(String[] args)
	{
		int[] a=new int[7];
		int evencount=0;
		int oddcount=0;
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			{
				evencount++;
				//System.out.println("even count "+evencount);
			}
			else if(a[i]%2!=0)
			{
				oddcount++;
				//System.out.println("odd count "+oddcount);
			}
			
		}
		System.out.println("evencount  "+evencount);
		System.out.println("oddcount "+oddcount);
		// TODO Auto-generated method stub

	}

}
