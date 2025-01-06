package jan5_SimpleShoppingApplication;

public class Product
{
	int id;
	String name;
	double price;
	int quantity;
	
	public Product(int id, String name, double price, int quantity) 
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void  decreaseQuantity( int quantity) throws InsufficientQuantityException
	{
		if(quantity>this.quantity)
		{
			throw new InsufficientQuantityException("requested quantity is not available.");
		}
		
			
		this.quantity-=quantity;
	        
	}

	
	
	
	
}

	


