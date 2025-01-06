package jan5_SimpleShoppingApplication;

public class ShoppingCart 
{
	
Product[] cartitem;
int itemCount;

public ShoppingCart(int capacity) 
{
	super();
	this.cartitem = new Product[capacity];
	this.itemCount = 0;
}

@SuppressWarnings("unused")
public void addToCart(Product product, int quantity) throws InsufficientQuantityException
{
	int f=0;
	if(product==null)
	{
		throw new InvalidProductException("Product is not found");	
	}
	
	if(itemCount<cartitem.length)
	{
		for(Product i:cartitem)
		{
			if(i.id==product.id)
			{
				f=1;
				i.quantity+=quantity;
			}
			else
		}
		
	}
	else if(product==null)
	{
		throw new InvalidProductException("Product is not found");
	}
	else
	{
		
	}

	public double calculateTotal()
	{
		double totalcost=0;
		
		
	}
}

}
