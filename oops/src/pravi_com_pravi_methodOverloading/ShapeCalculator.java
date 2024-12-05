package pravi_com_pravi_methodOverloading;
class Shape
{
	public static void CalculateArea(int sidelenght)
	{
		if(sidelenght<=0)
		{
			System.err.println("side lenght must be non-negtive");
		}
		else
		System.out.println("Area of the square is:"+(sidelenght*sidelenght));
		
	}
	public static void CalculateArea(int lenght,int width)
	{
		if(lenght<=0||width<=0)
		{
			System.err.println("lenght and width must be non-negative");
			
		}
		else
		System.out.println("Area of the rectangle:"+(lenght*width));
	}
	public static void CalculateArea(double radius)
	{
		double p=3.14;
		System.out.println("area of the circle:"+( p*radius*radius));
	}
}

public class ShapeCalculator 
{

	public static void main(String[] args) 
	{
		Shape.CalculateArea(7.0);
		Shape.CalculateArea(-5);
		Shape.CalculateArea(-5, 10);;

	}

}
