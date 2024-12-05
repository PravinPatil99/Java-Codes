package pravi.com.Has_relatation;

public class Customer 
{
	private int customerId;
	private String customerName;
	private String customerAddress;
	private Order1 order;
	
	public Customer(int customerId,String customerName,String customerAddress,Order1 order)
	{
	this.customerId=customerId;
	this.customerName=customerName;
	this.customerAddress=customerAddress;
	this.order=order;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", order=" + order + "]";
	}

	}
