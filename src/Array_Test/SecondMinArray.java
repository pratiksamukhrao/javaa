package Array_Test;

public class SecondMinArray {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,7,8};
		//int max=a[0];//1
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;i++)
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
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
		// TODO Auto-generated method stub

	}

}
