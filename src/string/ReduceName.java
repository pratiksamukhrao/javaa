package string;

import java.util.Scanner;

public class ReduceName 
{
	public static String reduce(String a)
	{
	    String str="";
	    String[] b=a.split("\\s");
	    //str=str+b[b.length-1];
	    for(int i=0;i<b.length-1;i++)
	    {
	    	str=str+b[i].charAt(0)+".";
	    }
	    str=str+b[b.length-1];
	    return str;
	}

	public static void main(String[] args) 
	{
		System.out.println("enter name");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println(ReduceName.reduce(s1));
		// TODO Auto-generated method stub

	}

}
