package com.pravin.getter_setter;

public class Product 
{
   private int productId;
   private String productName;
   private double productPrice;
   
public Product(int productId, String productName, double productPrice) 
{
	super();
	this.productId = productId;
	this.productName = productName;
	this.productPrice = productPrice;
}

@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + "]";
}
public static Product getProductObj()
{
	return new Product(100,"laptop",60000);
}
}



   
  