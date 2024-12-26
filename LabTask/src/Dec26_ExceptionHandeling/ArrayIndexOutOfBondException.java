package Dec26_ExceptionHandeling;

public class ArrayIndexOutOfBondException 
{

	public static void main(String[] args) 
	{
		
		try {
			 String a="pravin";
		  System.out.println(a.charAt(7));					
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		e.printStackTrace();
		
			
		}

	}

}
