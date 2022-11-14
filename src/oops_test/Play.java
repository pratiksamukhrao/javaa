package oops_test;
import java.util.Scanner;
public class Play 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    /*String hockey=sc.next();
		String tenis=sc.next();
		String kabadi=sc.next();
		String football=sc.next();
		String baseball=sc.next();*/
		System.out.println("enter your choice");
		String choice=sc.next();
	switch(choice)
	{
		case "hockey":System.out.println("India");
		break;
		case "tennis":System.out.println("chinaa");
		break;
		case "kabbadi":System.out.println("bangaladesh");
		break;
		case "football":System.out.println("italy");
		break;
		case "baseball":System.out.println("Uniterd-States");
		break;
		default:System.out.println("pls enter valid game");
		break;
	}
	
	}


}
