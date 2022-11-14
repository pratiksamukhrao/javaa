package string;

public class StringMethod {

	public static void main(String[] args)
	{
		//equal()==return boolean
		String p1="kiran";
		String p2="aniket";
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2);
		
		System.out.println("java".equals("JAVA"));//return false case sensetive
		
		String t1="pratik";
		String t2="pratik";
		System.out.println(t1==t2);//both refernce pointed into same object return true referece comparison
		System.out.println(t1.equals(t2));//equal method content comparions return true or false;
		
		String a1="java";
		String a2="JAVA";
		System.out.println(a1.equalsIgnoreCase(a2));//return true/false value..
		//compareTo()==>"Interger";
		String s="bb";
		String st="aa";//first string bigger +ve value differce 
		System.out.println(s.compareTo(    st));//comparison help to case-sensetive.return interger value either positive or negative
		
		String s1="cc";
		String s2="dd";
		System.out.println(s1.compareTo(s2));//first string smaller return -ve value differnce.
		
	    String b1="Java";
	    String b2="JAVA";
	    System.out.println(b1.compareToIgnoreCase(b2));//ignorcase both same return zero.
	    //concat() method
	    String c1="good";
	    String c2=new String("morning");
	    System.out.println(c1.concat(c2));//add to string output goodmorning
	    
	    String d1="good";
	    d1.concat("morning");
	    System.out.println(d1);//modify not allowed immutable//output-- good
	    
	    String e1="good";
	    e1=e1.concat("morning");
	    System.out.println(e1);//output goodmorning
	     
	   //indexof() --based on character value check the indexno //return int
	    String f1="think";
	    System.out.println(f1.indexOf('k'));
	    System.out.println(f1.indexOf('z'));//specified character is not availale return -1 value
	    
	    String g1=("baabbaa");
	    System.out.println(g1.indexOf('a'));//first index occurance only;
	    
	    //lastindexof() based on char value check last index no of char;
	    String g2="baabbaba";
	    System.out.println(g2.lastIndexOf('b'));
	    
	    //toLowercase() converted string into lowercase;
	    String h1="GOODMORINIG";
	    System.out.println(h1.toLowerCase());
	    
	    //toUppercase()
	    String h2="goodmorning";
	    System.out.println(h2.toUpperCase());
	    
	    //isEmpty()check the string empty or not
	    String i1=" ";
	    System.out.println(i1.isEmpty());
	     
	    //substring-->retrun string
	    String j1="exception";
	    System.out.println(j1.substring(2));//2nd index to end index
	    
	    //substring-->return string
	    String j2="handling";
	    System.out.println(j2.substring(2, 5));//last index-1;
	    
	    //replace-->return string
	    String k1="database";
	    System.out.println(k1.replace('d', 't'));
	    
	    //intern()-->return string
	    String k2="exception Handling";
	    System.out.println(k2.intern());
	    
	   
	    
	    
	    
	    
		
		
	
		
		
	}

}
