package Test;

import java.util.Scanner;

public class ChekPassword
{
	public static void passchek(String []plist,String password)
	{
		 String rev=" ";
		// int count=0;
		// int sum=0;
		 //int count1=0;
         int firstvalue=Character.getNumericValue(password.charAt(0));
         int lastvalue=Character.getNumericValue(password.charAt(password.length()-1));
           
         rev=Character.toString(password.charAt(3))+ //ord
        	 Character.toString(password.charAt(2))+
        	 Character.toString(password.charAt(1));
         char[] ch=rev.toCharArray();
         
         for(int i=0;i<plist.length;i++)
         {
        	 char ps[]=plist[i].toCharArray();
        	 
        	 //uppercase
        	 int count=0;
        	 for(int j=0;j<ps.length;j++)
        	 {
        		 if(ps[j]>='A' && ps[j]<='Z')
        		 {
        			 count++;//4
        		 }
        	 }
        	 //for sum
        	 int sum=0;
        	 for(int k=0;k<ps.length;k++)
        	 {
        		 if(ps[k]>='0' && ps[k]<='9')
        		 {
        			 sum=sum+Character.getNumericValue(ps[k]);//6
        		}
        	 }
        	 int count1=0;
        	 for(int m=0;m<ps.length;m++)
        	 {
        		 for(int n=0;n<ch.length;n++)
        		 {
        			 if(ps[m]==ch[n])
        			 {
        				 count1++;//3
        			 }
        		 }
        	 }
        	 if(count==firstvalue)
        	 {
        		 if(sum==lastvalue)
        		 {
        			 if(count1==3)
        			 {
        				 System.out.println(plist[i]);
        			 }
        		 }
        	 }
         }
         
         
	}

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a list of password");
		String pl[]=new String[3];
		for(int i=0;i<pl.length;i++)
		{
			pl[i]=sc.next();
		}
		System.out.println("enter password");
		String pass=sc.next();
	    ChekPassword.passchek(pl,pass);
		// TODO Auto-generated method stub

	}

}
