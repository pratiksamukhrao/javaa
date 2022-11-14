package Test;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape t=new Triangle();
		t.draw();

	}

}
class Shape
{
	protected void draw()
	{
		System.out.println("i am drawing shaop");
	}
}
class Triangle extends Shape
{
	public void draw()
	{
		System.out.println("i am drawing trianlge");
	}
}