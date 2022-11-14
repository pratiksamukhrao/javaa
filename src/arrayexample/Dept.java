package arrayexample;
class Company
{
	int id;
	String name;
	double sal;
	String add;
	Company(int id,String name, double sal,String add)
	{
        this.id=id;
        this.name=name;
        this.sal=sal;
        this.add=add;
	}
	public String toString()
	{
		return id+" "+name+" "+sal+" "+add;
	}
}
public class Dept
{
	int deptid;
	String deptname;
	Company c;
	Dept(int deptid, String deptname,Company c)
	{
		this.deptid=deptid;
		this.deptname=deptname;
		this.c=c;
	}
	public String toString()
	{
		return deptid+" "+deptname+" "+c;
	}
    public static void main(String[] args)
    {
    	Dept[] d=new Dept[3];
    	d[0]=new Dept(101,"math",new Company(1,"pratik",13213.21,"pune"));
    	d[1]=new Dept(102,"physics",new Company(2,"kiran",13413.45,"satara"));
    	d[2]=new Dept(103,"science",new Company(3,"dada",131354.54,"dhule"));
    	
    	for(int i=0;i<d.length;i++)
    	{
    		System.out.println(d[i]);
    	}
    	
    			
    	
    	
		// TODO Auto-generated method stub

	}

}
