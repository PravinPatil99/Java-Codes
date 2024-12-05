package com.pravi.inheritance;

class Product1
{
    protected String name;
    protected double price;

    public Product1(String name,double price)
    {
       this.name=name;
       this.price=price;
    }
    public void displayInfo1()
    {
        System.out.println("name:"+name);
        System.out.println("price:"+price);
    }
    
    public double totalCost(int quantity)
    {
       double quantity1=quantity*price;
        return quantity1;
    }
}

class Electronic extends Product1
{
    private String brand;

  public Electronic(String name, double price, String brand) {
		super(name, price);
		this.brand = brand;
	}


public void displayInfo2()
   {
    System.out.println("Product brand is :"+brand);
   }
}

class Clothing2 extends Product
{
    private String size;

    
	public Clothing2(String name, double price, String size, String brand) {
		super(name, price,brand);
		this.size = size;
	}
		public void displayInfo3()
    {
        System.out.println("Product size is :"+size);
    }
}

public class OnlineShoppingSystemTester
{
	public static void main(String[]args)
	{
    Clothing2 c=new Clothing2("shirt",700,"m","denim");
    c.displayInfo();
     c.calculateTotalCost(5);
     c.displayInfo();
     c.displayInfo3();
    

   // System.out.println(c);
    
    

}
}
  

