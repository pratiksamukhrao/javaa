package arrayexample;

import java.util.Arrays;

public class SecondMaxNumber {

	public static void main(String[] args) 
	{
		int a[]= {5,3,7,6,8};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[1]);
		//System.out.println(Arrays.toString(a));
		// TODO Auto-generated method stub

	}

}
