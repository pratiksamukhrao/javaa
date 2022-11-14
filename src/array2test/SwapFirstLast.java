package array2test;

import java.util.Arrays;

public class SwapFirstLast {

	public static void main(String[] args) 
	{
		/*int a[]= {1,2,3,4,5};
		int size=a.length;
		int temp=a[0];
		a[0]=a[size-1];
		a[size-1]=temp;
		System.out.println(Arrays.toString(a));*/
		/*int []a= {1,2,3,4,5};
		int size;
		int temp;
		for(int i=0;i<a.length;i++)
		{
			size=a.length;    
			temp=a[0];
			a[0]=a[size-1];
			a[size-1]=temp;
			
		}
		System.out.println(Arrays.toString(a));*/
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
	}

}
