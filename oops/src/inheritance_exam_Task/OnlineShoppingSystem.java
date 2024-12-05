package inheritance_exam_Task;

class Product
{
	protected String name;
	protected double price;
	
	public Product(String name,double price)
	{
		super();
		this.name=name;
		this.price=price;
		}
	public void displayInfo()
	{
		System.out.println("Product name:"+name);
		System.out.println("Product Price:"+price);
	}
	public void calculteTotalCost(int quantity)
	{
		double quantity1=quantity*price;
		System.out.println("total quantity cost:"+quantity1);
		
		}
}


class Electronic extends Product
{
	private String brand;
	
	public Electronic(String name,double price,String brand)
	{
		super(name,price);
		this.brand=brand;
	}
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("product brand is :"+brand);
	}
	}


class Clothing extends Product
{
	private String size;

	public Clothing(String name, double price, String size) 
	{
		super(name, price);
		this.size = size;
	}
public void displayInfo()
{
	super.displayInfo();
	System.out.println("Product size:"+size);
}
}

public class OnlineShoppingSystem 
{
	public static void main(String[] args) 
	{
		Electronic e= new Electronic("laptop",60000,"HP");
		System.out.println("\nElectronic Info:\n");
		e.displayInfo();
		e.calculteTotalCost(7);
		
		Clothing c= new Clothing("t-shirt",600,"m");
		System.out.println("\nClothing Info:\n");
		c.displayInfo();
		c.calculteTotalCost(7);
		
	}

}
