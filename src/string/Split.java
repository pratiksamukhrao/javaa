package string;

public class Split {

	public static void main(String[] args) 
	{
	    String name="india@is@my@country";
	    System.out.println(name.split(" "));//java.lang.String;@
	    String var="india@is@my@country";
	    String a[]=var.split("@");//divide string 
	   for(int i=0;i<a.length;i++)
	   {
		   System.out.println(a[i]);
	   }
		// TODO Auto-generated method stub

	}

}
