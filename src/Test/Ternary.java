package Test;
import java.util.Scanner;
public class Ternary {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		String result=(score<40000)?(score<25000)?"broze":"silver":(score<60000)?"gold":"platinum";
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}
