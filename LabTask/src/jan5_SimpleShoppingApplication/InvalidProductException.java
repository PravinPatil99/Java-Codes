package jan5_SimpleShoppingApplication;

@SuppressWarnings("serial")
public class InvalidProductException extends RuntimeException
{
	public InvalidProductException(String Error)
	{
		super(Error);
	}

}
