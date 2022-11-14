package com.java.day21;
import java.util.*;
public class TestArray {

	public static void main(String[] args)
	{
		float ar1[];//declaration of array
		
		float[]a=new float[5];//intilization of array
		a[0]=1f;
		a[1]=2.20f;
		a[2]=3.2f;
		a[3]=4.2f;
		a[4]=5.2f;
		System.out.println(a[0]);//print array using sysout statement
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("/----------------------------------------/");
		for(float bb:a)//for each loop print the array
		{
			System.out.println(bb);
		}
		System.out.println("////////////");
		for(float i=0;i<a.length;i++)//for loop print array
		{
			System.out.print(i);
		}
		
		// TODO Auto-generated method stub

	}

}
