package dec30_ExceptionHandeling;

public class classCastExceptionDemo
{
	public static void handleCastClassException()
	{
		Object[] obj= {"Hello",123,"java"};
		
		for(Object obj1:obj) 
		{
		try 
		{
			
			String str=(String) obj1;
			
			System.out.println("Castig Suessfully:"+str);
			
			
		}
			catch( ClassCastException e)
			{
				System.out.println("ClassCastException :canot cast"+obj.getClass().getName()+"to String");
				e.printStackTrace();
			}
		}
			
	}

	public static void main(String[] args) 
	{
		
			classCastExceptionDemo.handleCastClassException();
	}
	
	
	}


