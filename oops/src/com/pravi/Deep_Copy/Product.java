package com.pravi.Deep_Copy;

public class Product 
{
  private int productName;
  private double producrPrice;
  
  public Product()
  {
	  productName=0;
	  producrPrice=0.0;
  }
  
 public Product(int productName, String string) {
	super();
	this.productName = productName;
	this.producrPrice = producrPrice;
}

public int getProductName() {
	return productName;
}

public void setProductName(int productName) {
	this.productName = productName;
}

public double getProducrPrice() {
	return producrPrice;
}

public void setProducrPrice(double producrPrice) {
	this.producrPrice = producrPrice;
}

@Override
public String toString() {
	return "Product [productName=" + productName + ", producrPrice=" + producrPrice + "]";
}
  
  

}
