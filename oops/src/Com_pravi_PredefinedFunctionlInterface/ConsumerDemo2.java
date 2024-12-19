package Com_pravi_PredefinedFunctionlInterface;

import java.util.function.Consumer;

public class ConsumerDemo2 {
	

	public static void main(String[] args) 
	{
		Consumer<Bank> b1=bank->System.out.println("Bank type:"+bank);
		b1.accept(new Bank(12345,"pravin patil"));
	
	}

}
class Bank
{
	private int accountNum;
	private String cusName;
	/**
	 * @param accountNum
	 * @param cusName
	 */
	public Bank(int accountNum, String cusName) {
		super();
		this.accountNum = accountNum;
		this.cusName = cusName;
	}
	@Override
	public String toString() {
		return "Bank [accountNum=" + accountNum + ", cusName=" + cusName + "]";
	}
	
}
