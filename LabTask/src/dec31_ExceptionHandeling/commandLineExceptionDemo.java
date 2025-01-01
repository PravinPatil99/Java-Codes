package dec31_ExceptionHandeling;

public class commandLineExceptionDemo{

	public static void main(String[]args)
	{
		try 
		{
			
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		System.out.println("Division result:"+x/y);
		
		
		}
		catch(IllegalArgumentException e)
		{
			System.out.print(e);
		}
		catch( Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Division operation completed");
		}
	}
	
}

