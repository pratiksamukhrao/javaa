package Array_Test;
import java.util.Scanner;
public class CountEOdd
{
	int evencount=0;
	int oddcount=0;
	void evenodd(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evencount++;
			}
			else if(a[i]%2!=0)
			{
				oddcount++;
			}
		}	
		System.out.println("evencount "+evencount);
		System.out.println("oddcount "+oddcount);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		CountEOdd e=new CountEOdd();
		e.evenodd(arr);
		// TODO Auto-generated method stub

	}

}
