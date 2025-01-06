package Jan3_BankApplication;

@SuppressWarnings("serial")
public class LoanNotAllowedException  extends RuntimeException
{
	public LoanNotAllowedException(String Errormessage)
	{
		super(Errormessage);
	}

}
