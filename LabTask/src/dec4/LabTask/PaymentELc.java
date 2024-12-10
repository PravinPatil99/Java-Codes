package dec4.LabTask;

public class PaymentELc 
{
	public static void main(String[]args)
		{
			Payment p=new Payment();
			p.processPayment();
			
			Payment c=new CreditCard();
			c.processPayment();
			
			Payment p1=new PayPalPayment();
			p1.processPayment();
			
			Payment b=new BankTransferPayment();
			b.processPayment();
			
	}
		
		public void processMultiplePayments(Payment... payment)
		{
			for(Payment p :payment)
				p.processPayment();
		}
	}
