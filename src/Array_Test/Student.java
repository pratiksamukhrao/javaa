package Array_Test;
import java.util.Scanner;
class Student
{
	
	int sid;
	String sname;
	Student(int ssid,String ssname)
	{
		this.sid=ssid;
		this.sname=ssname;
	}
	public String toString()
	{
		return sid+" "+sname;
	}
	static void update(Student std[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a id for update");
		int id=sc.nextInt();
		for(int i=0;i<std.length;i++)
		{
			if(std[i].sid==id)
			{
				System.out.println("enter a name");
				String newname=sc.next();
				std[i].sname=newname;
			}
			System.out.println(std[i]);
		}
	}
	
	static void delete(Student std[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  the id or delete");
		int id=sc.nextInt();
		for(int i=0;i<std.length;i++)
		{
			if(std[i].sid==id)
			{
				std[i]=null;
			}
			System.out.println(std[i]);
		}
	}
	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Student[] s=new Student[2];
		System.out.println("1.create \n2.Read \n3.update \n4.delete");
		int choice;
		do
		{
			System.out.println("enter a choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("create a student info");
			for(int i=0;i<s.length;i++)
			{
				System.out.println("enter a student id");
				int ssid=sc.nextInt();
				System.out.println("enter a student name");
				String ssname=sc.next();
				s[i]=new Student(ssid,ssname);
			}
			break;
			case 2:System.out.println("read the student data");
			for(Student ss:s)
			{
				System.out.println(ss);
				
			}
			break;
			case 3:
			
				Student.update(s);
			break;
			case 4:
			
				Student.delete(s);
			break;
			}
			
		}while(choice!=0);
	}
}
