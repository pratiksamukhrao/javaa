package Array_Test;

public class PredictOutput
{
	static int mcCarthyCounter=100;
	public static int mcCarthy(int n)//100
	{
		mcCarthyCounter++;//101
		if(n>100)//false
		return n-10;
		else
		return mcCarthy(n+11);//100+11=111
	}

	public static void main(String[] args)
	{
		System.out.println(mcCarthy(100)+"  "+mcCarthyCounter);
		//System.out.println(100>100);
		// TODO Auto-generated method stub

	}

}
