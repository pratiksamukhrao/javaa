package arrayexample;

import java.util.Arrays;

public class Revers {

	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5,6};
		int temp;
		int i,j=a.length-1;
		for(i=0;i<a.length/2;i++)
		{
			
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			     j--;
		}
 		System.out.println(Arrays.toString(a));
		
	}

}
