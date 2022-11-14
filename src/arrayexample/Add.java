package arrayexample;
class Sub
{
	int a;
	int b;
	Sub(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int m1()
	{
		return a-b;
	}
	
}
public class Add
{
	int c;
	int d;
	Sub s;
	Add(int c,int d,Sub s)
	{
		this.c=c;
		this.d=d;
		this.s=s;
	}
	public int m2()
	{
		return c+d;
	}
    public static void main(String[] args)
    {
    	Add[] a=new Add[2];
    	a[0]=new Add(20,30,new Sub(50,30));
    	a[1]=new Add(50,50,new Sub(10,10));
    	for(int i=0;i<a.length;i++)
    	{
    		System.out.println(a[i]);
    	}
    	
		// TODO Auto-generated method stub

	}

}
