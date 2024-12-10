package AbstractMethogDec09Task;

  abstract class shape1
 {
	 public abstract void draw();

}
  class Square extends  shape1
  {
	  @Override
	  public void draw()
	  {
		  System.out.println("Square draw");  }
  }
 
  

  class Rectangle extends shape1
  {
	  @Override
	  public void draw() 
	{
		  System.out.println("Rectangle draw");
	  }
	  
  }
  public class shape
  {
	  public static void main (String[]args)
	  {
		  shape1 s1=null;
		  s1=new Square();s1.draw();
		  s1=new Rectangle(); s1.draw();
	  }
  }