package Test;

public class AbstractDemo {

	public static void main(String[] args) 
	{
		Abs2 abs=new Abs2();
		
		// TODO Auto-generated method stub

	}

}
abstract class Abs1
{
	int num;
	public abstract void move();
}
class Abs2 extends Abs1
{
	public void move()
	{
		System.out.println(num);
	}
	public void show()
	{
		System.out.println("in show method");
	}
}