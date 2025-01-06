package Jan3_BankApplication;

 @SuppressWarnings("serial")
class InsufficientFundsException  extends Exception
 {
	 public InsufficientFundsException(String Errormessage)
	 {
		 super(Errormessage);
	 }

}
 