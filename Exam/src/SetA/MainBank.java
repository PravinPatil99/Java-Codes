package SetA;

public class MainBank {

	public static void main(String[] args) 
	{
		SavingAccount s=new SavingAccount(1000.0,10.0);
		s.deposit(200.0);
		s.calcualteIntrest();
		
		CheckingAccount c=new CheckingAccount(1000.0);
		c.deposit(300.0);
		c.withdraw(100.0);

	}

}
