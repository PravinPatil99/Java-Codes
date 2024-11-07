package oops.com.pravi.Blc1;

public class Product 
{
static int productid;
String productname;
double productprice;

public void setProductData(int id,String pname,double price)
{
	productid=id;
	productname=pname;
	productprice=price;
	
	
}

public void getproductInfo()
{
	System.out.println("The id of the product is :"+productid);
	System.out.println("name of the product is :"+productname);
	System.out.println("product price is :"+productprice);
	
	
	
	
}


	
}
