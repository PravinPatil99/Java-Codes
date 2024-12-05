package pravi.com.Has_relatation;

public class Order1 
{
	private int orderID;
	private String itemName;
	private double itemPrice;

	public Order1(int orderID, String itemName, double itemPrice) {
		super();
		this.orderID = orderID;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
     @Override
	public String toString() {
		return "Order1 [orderID=" + orderID + ", itemName=" + itemName + ", itemPrice=" + itemPrice + "]";
	}
	
}
/*
 * Create a class Order (Business Logic Class)
Instance Variables: 
   private int orderId;
   private String itemName;
   private double itemPrice;
Create a parameterized constructor initialize the instance variable of the class.
Override toString() from Object class to print Order class properties.

Create a class Customer (Business Logic Class)
Instance Variables: 
   private int customerId;
   private String customerName;
   private String customerAddress;
   private Order order; //HAS-A relation
Create a parameterized constructor initialize the instance variable of the class.
Override toString() from Object class to print Customer class properties.

Create a class Zomato (Executable Logic Class) which contains main method to print Customer class properties using toString() method.


 */
  
