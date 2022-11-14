package oops_test;

public class SmilyTest {

	public static void main(String[] args) 
	{
		Smile a=new Smile();
		talk(a);
		a.frown();
	}
	public static void talk(Ismile ia1)
	{
		System.out.print(" :-0 ");
		ia1.smile();
	}
}
interface Ismile
{
	void smile();
}
class Smile implements Ismile
{
	public void smile()
	{
		System.out.print(" :-) ");
	}
	void frown()
	{
		Ismile a1=new Smile();
	    a1.smile(); 
	    System.out.print(" :-[ ");
	}
}
