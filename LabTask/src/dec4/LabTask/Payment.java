package dec4.LabTask;

public class Payment 
{
	public void processPayment()
	{
		System.out.println("payment processing ");
	}

}
class CreditCard  extends Payment
{
	@Override
	public void processPayment()
	{
		System.out.println("Processing credit card payment ");
	}
}
class PayPalPayment extends Payment
{
	@Override
	public void processPayment()
	{
		System.out.println("Processing PayPal payment ");
	}
}
class BankTransferPayment  extends Payment
{
	@Override
	public void processPayment()
	{
		System.out.println("Processing bank transfer payment");
	}
	
}