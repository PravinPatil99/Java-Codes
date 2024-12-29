package Dec27_ExceptionHandeling;

public class IllegalStateExceptionDemo 
{
	static void throwIllegalexception()
	{
		try {
			
			throw new IllegalStateException("my exception");
			
		}
		
		catch(IllegalStateException obja)
		{
			System.err.println("Caught:"+obja);
		}
	}

	public static void main(String[] args) 
	{
		IllegalStateExceptionDemo.throwIllegalexception();
		
	}

}
