package Dec27_ExceptionHandeling;


public class ArrayException {

	public static void main(String[] args) 
	{
		try {
			int arr[]=new int[2];
			
			System.out.println("Array:"+arr[10]);
			System.out.println("End of try");
			}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		

	}

}
