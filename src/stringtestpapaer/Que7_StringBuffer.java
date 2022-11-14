package stringtestpapaer;

public class Que7_StringBuffer {

	public static void main(String[] args) 
	{
		StringBuffer obj=new StringBuffer("Good");
	    System.out.println(obj);
	    
	    obj.append("morning");
	    System.out.println("append "+obj);
	    
	    obj.insert(0, "hii");
	    System.out.println("insert "+obj);
	    
	    obj.replace(2, 7,"___");
	    System.out.println("Replace "+obj);
	    
	    obj.delete(2,5);
	    System.out.println("delete "+obj);
	    
	    obj.reverse();
	    System.out.println("Revers "+obj);
		// TODO Auto-generated method stub

	}

}
