package oops.com.pravi.Blc1;
import java.util.*;
public class LaptopnewElc1 {

	public static void main(String[] args) 
	{
		Laptopnew p1 = new Laptopnew();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the laptop brand is :");
	   p1.laptopBrand=sc.nextLine();
		
		System.out.println("Enter  the laptop price:");
	    p1.laptopPrice=sc.nextDouble();
		
		System.out.println("is it touch screen:");
		p1.isTouchScreen=sc.nextBoolean();
		
	   p1.getLaptopInforamtion();
		
		
		
		
		

	}

}
