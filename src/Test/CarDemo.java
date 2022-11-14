package Test;
interface Car
{
	public void drive();
}
public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Car car=new Swift();
         car.drive();
			
			
	}

}
class Swift implements Car
{
	public void drive()
	{
		System.out.println("i am driving");
	}
}
