package oops;

public class Order 
{
	private String orderItem;
	private int orderId;
	
	public Order(String orderItem, int orderId)
	{
		this.orderItem=orderItem;
		this.orderId=orderId;
		
	}
	public void setOrderItem(String orderItem)
	{
		this.orderItem=orderItem;
	}
	public String getOrderItem(String orderItem)
	{
		return orderItem;
	}
   
	public void setOrderID(int orderID)
	{
		this.orderId=orderID;
	}
	public int getOrderId(int orderID)
	{
		return orderID;
	}
	@Override
	public String toString() {
		return "Order [OrderItem=" + orderItem + ", orderId=" + orderId + "]";
	}
	
}

