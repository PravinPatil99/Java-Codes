package Dec05.LabTask;

public class AccountManagementSystem 
{

	public static void main(String[] args) 
	{
		SavingAccount s=new SavingAccount("292938392122",200000,3.5);
		System.out.println("generating statement:");
		s.generateStatement();
		
		CheckingAccount c= new CheckingAccount("1234567890",300000,20000);
		System.out.println("\nGenerating checking account:");
		c.generateStatement();
		
		
	}

}
