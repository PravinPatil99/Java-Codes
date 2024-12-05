package dec4.LabTask;

public class Shape
{
	
	public static Shape randShape()
		{
			switch ((int) (Math.random()*3))
			{
			case 0: 
			return new Circle();
			case 1: 
				return  new Square();
			case 2:
				return  new Triangle();
				default:
					System.out.println("Default meassage");
					return  new Shape();
		               }
		}
		
		public void draw()
		{
			System.out.println("Shape draw");
		}
		public void erase()
		{
			System.out.println("Shape Erase");
		}
		
}


	

class Circle extends Shape
{
	
	public Circle() 
	{
		super();
		this.draw();
		this.erase();
	}

	@Override
	public void draw()
	{
	
		
		System.out.println("Circle draw");
	}
	@Override
	public void erase()
	{
		System.out.println("Circle erase");
		
	}
	
}
class Triangle extends Shape
{

	public Triangle()
	{
		super();
		this.draw();
		this.erase();
	}
 
	@Override
	public void draw()
	{
		System.out.println("Triangle  draw");
	}

	@Override
	public void erase()
	{
		System.out.println("Triangle erase");
		
	}
}
class Square extends Shape
{
	
	public Square() 
	{
		super();
		this.draw();
		this.erase();
	}

	@Override
	public void draw()
	{
		System.out.println("Square  draw");
	}
	@Override
	public void erase()
	{
		System.out.println("Square erase");
		
	}
}


