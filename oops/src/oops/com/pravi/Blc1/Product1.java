package oops.com.pravi.Blc1;

import java.util.*;
public class Product1 
{

	public static void main(String[] args)
	{
		Product p1 = new Product();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the product id:");
		 int productid =sc.nextInt();
		
		System.out.println("Enter the product name:");
		String productname=sc.next();
		
		System.out.println("Enter the product price:");
		double productprice=sc.nextDouble();
		
		p1.setProductData(productid,productname,productprice);
		
		p1.getproductInfo();
		
	
		
		sc.close();
	}
	
		
		
		
		
		
		
		
		
		
		
		
	}


