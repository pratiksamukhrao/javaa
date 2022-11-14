package array2test;

public class SecondHigest {

	public static void main(String[] args) 
	{
		int a[]= {5,4,12,8,9,10,43,7,3,1};
		int b;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					b=a[i];
					a[i]=a[j];
					a[j]=b;
					
				}
			}
		}
		int sum=0;
		for(int k=2;k<a.length;k++)
		{
			sum=sum+a[k];
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
