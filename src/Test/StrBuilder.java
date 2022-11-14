package Test;

public class StrBuilder {

	public static void main(String[] args)
	{
		StringBuilder sb=new StringBuilder("poly");
		System.out.println(sb.append("morph"));
		sb.reverse();
		String str=sb.toString();
		System.out.println(str.substring(5));
		// TODO Auto-generated method stub

	}

}
