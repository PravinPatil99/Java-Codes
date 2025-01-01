package dec31_ExceptionHandeling;

public class financialTransaction
{
	public void processTransaction(double amount,long accountnumber)
	{
		try
		{
			if(amount<=0)
			{
				throw new Error("Transaction amount must be positive");
			}
			
			else
			{
			System.out.println("Transaction amount:"+amount);
			System.out.println("Account number:"+accountnumber);
			System.out.println("Processing transaction....");
			System.out.println("Transaction successful: Amount Rs."+ amount+ " transferred to account "+ accountnumber);			
		}
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());;
			
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
public static void main (String[]args)
{
	financialTransaction f=new financialTransaction();
	f.processTransaction(300, 1234567890);
}
}




