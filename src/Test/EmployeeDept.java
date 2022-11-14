package Test;
import java.util.Scanner;
class Department
{
	int deptId;
	String deptname;
	Department(int did,String dname)
	{
		this.deptId=did;
		this.deptname=dname;
	}
}
class Employee
{
	int empno;
	String name;
	Department dept;
	Employee(int empno,String ename,Department dept)
	{
		this.empno=empno;
		this.name=ename;
		this.dept=dept;
	}
	public String toString()
	{
		return "emp no: "+ empno +" emp name "+name+" dept id"+dept.deptId+"dept name "+dept.deptname; 
	}
}
public class EmployeeDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee arr[]=new Employee[3];
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println("enter a empid ");
			 int empno=sc.nextInt();
			 System.out.println("enter a name");
			 String ename=sc.next();
			 System.out.println("enter a department id");
			 int did=sc.nextInt();
			 System.out.println("enter a dept name");
			 String dname=sc.next();
			 Department d=new Department(did,dname);
			 arr[i]=new Employee(empno,ename,d);
		 }
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
	}

}
