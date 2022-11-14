package oops_test;

class Department
{
	private String name;
	private String add;
	public void setname(String name)
	{
		this.name=name;
	}
	public void setadd(String add)
	{
		this.add=add;
	}
	public String getname()
	{
		return name;
	}
	public String getadd()
	{
		return add;
	}
}
public class Employee
{
	private int id;
	private String name="hii";
	private boolean ismanager;
	private float salary;
	Department dept;
	public void setid(int id)
	{
		this.id=id;
	}
	public void setis(boolean ismanager)
	{
		this.ismanager=ismanager;
	}
	
	public void setf(float salary)
	{
		this.salary=salary;
	}
	public void setd(Department dept)
	{
		this.dept=dept;
	}
	public int getid()
	{
		return id;
	}
    public String getn()
	{
		return name;
	}
    public boolean getismanager()
    {
    	return ismanager;
    }
    public float getsalary()
    {
    	return salary;
    }
    public Department getd()
    {
    	return dept;
    }
	

	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.setid(101);
		e.setis(true);
		e.setf(40000f);
		e.setd(new Department());
		Department d=e.getd();
		d.setname("amar");
		d.setadd("pune");
		System.out.println(e.getid()+""+e.getn()+""+e.getismanager()+""+e.getsalary()+""+e.getd().getname()+""+e.getd().getadd()); 
		
		// TODO Auto-generated method stub

	}

}
