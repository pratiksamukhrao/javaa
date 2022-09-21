package com.java.day14;

public class Demo {

	public static void main(String[] args) 
	{
		int num=11221;
		int r,a,b,count=0;
		while(num!=0)
		{
			r=num%10;
			a=r;
			if(a==r)
			{
				count++;
			} 
			System.out.println(a+""+count);
			num=num/10;
			while(num!=0)
			{
				r=num%10;
				b=r;
				if(b==r)
				{
					count++;
				}
				System.out.println(b+" "+count);
				num=num/10; 
			}
		}
		// TODO Auto-generated method stub

	}

}
