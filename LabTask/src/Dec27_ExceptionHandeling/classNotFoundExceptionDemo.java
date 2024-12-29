package Dec27_ExceptionHandeling;

public class classNotFoundExceptionDemo 
{
	

	public classNotFoundExceptionDemo() 
	{
		class c;
	try {
		c=Class.forName("TestClass");	
		}
	
	catch(ClassNotFoundException e)

	{
		e.printStackTrace();
	}
		}

	public static void main(String[] args)
	{
		new classNotFoundExceptionDemo();
		 
	}

}
