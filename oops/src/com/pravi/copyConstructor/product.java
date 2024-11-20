package com.pravi.copyConstructor;

public class product {
	
	private int productId;
	private String productName;
	
	public product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	
	public product(product p)
	{
		this.productId=p.productId;
		this.productName=p.productName;
		
				}

	@Override
	public String toString() {
		return "product [productId=" + productId + ", productName=" + productName + "]";
	}
	

}
