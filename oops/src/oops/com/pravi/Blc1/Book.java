package oops.com.pravi.Blc1;

public class Book 
{
	private String title;
	private String author;
	private double price;
	
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	

	public void applyDiscount(double discountPercentage)
	{
	    this.price = this.price - (this.price/100)*discountPercentage; 
	}
	
	
	public void printDetails()
	{
		System.out.println("Book [title=" + title + ", author=" + author + ", price=" + price + "]");
	}
	

}
