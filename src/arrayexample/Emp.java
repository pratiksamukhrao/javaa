package arrayexample;
import java.util.Scanner;
public class Emp 
{
	 int id;
	  String name;
	  int salary;
	  int sal;
	   Emp(int id,String name,int salary)
	   {
		   this.id=id;
		   this.name=name;
		   this.salary=salary;
	   }
	   void per()
	   {
		   if(salary<15000)
		   {
			   sal=(salary*10)/100;
			   salary=salary+sal;
			   
		   }
		   System.out.println(id+" "+name+" "+salary);
	   }
	   
   public static void main(String[] args)
   {
	   Emp e=new Emp(1, "kiran", 13000);
	   e.per();
	   Emp e1=new Emp(2,"pratik",20000);
	   e1.per();
	   Emp e2=new Emp(3,"ravi",30000);
	   e2.per();
	   Emp e3=new Emp(4,"kunal",14000);
	   e3.per();
	 
	   
	   
		// TODO Auto-generated method stub

	}

}
