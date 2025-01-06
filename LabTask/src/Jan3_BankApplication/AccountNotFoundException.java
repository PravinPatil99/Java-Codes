package Jan3_BankApplication;

 @SuppressWarnings("serial")
class AccountNotFoundException extends Exception
 {
	 public AccountNotFoundException(String Errormessage)
	 {
		 super(Errormessage);
	 }

}
