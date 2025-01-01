package dec31_ExceptionHandeling;

public class ArrayStoreExample 
{
	public static void storeObjects()
	{
	Object[]  arraystring=new String[5];
	
	try
	{
		arraystring[0]="hello";
		arraystring[1]="pravin";
		arraystring[2]=123;
		System.out.println("Array Stores Sucessfully");
		
	}
	catch(ArrayStoreException e)
	{
		System.err.println("ArrayStoreException caught: Incompatible type:"+e.toString());
	}
	
	}

	public static void main(String[] args) 
	{
		try
		{
			ArrayStoreExample.storeObjects();		
		}
		catch(ArrayStoreException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
