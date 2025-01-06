package Jan3_BankApplication;

public class CustomerClass 
{
private String name;
private BankAccountClass toAccount;//Has a relationship

public CustomerClass(String name, BankAccountClass toAccount) {
	super();
	this.name = name;
	this.toAccount = toAccount;
}

public BankAccountClass getAccount()
{
	return toAccount;
}

}
