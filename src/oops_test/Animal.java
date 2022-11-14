package oops_test;

public class Animal 
{
	String name="animal";
	String makenoise()
	{
		return "generic noise";
	}
}
class Dog extends Animal
{
	String name;
	String show()
	{
		return name;
	}
	
	public static void main(String[] args) 
	{
		Dog a=new Dog();
		System.out.println(a.show());
		// TODO Auto-generated method stub

	}

}
