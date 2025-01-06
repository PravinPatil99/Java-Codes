package jan5_SimpleShoppingApplication;

@SuppressWarnings("serial")
public class InsufficientQuantityException extends Exception
{
	public InsufficientQuantityException(String Error)
	{
		super(Error);
	}

}
