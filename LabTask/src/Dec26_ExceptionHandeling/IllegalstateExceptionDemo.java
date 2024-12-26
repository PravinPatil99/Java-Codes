package Dec26_ExceptionHandeling;

public class IllegalstateExceptionDemo {

	public static void main(String[] args) 
	{
		try {
			
			throw new IllegalStateException("");			
		}
		catch(IllegalStateException obja)
		{
			
			System.out.println("caught:"+obja);
			
		}
	

	}

}
