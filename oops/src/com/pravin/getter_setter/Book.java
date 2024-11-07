package com.pravin.getter_setter;

import java.util.Scanner;
public class Book 
{
	private String bookTittle;
	private String authorName;
	public Book(String bookTittle, String authorName) {
		super();
		this.bookTittle = bookTittle;
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "Book [bookTittle=" + bookTittle + ", authorName=" + authorName + "]";
	}
	
	public static Book setBookObj()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the book tittle:");
		String tittle=sc.nextLine();
		
		System.out.println("Enter the author :");
		String author=sc.nextLine();
		
		return new Book (tittle,author);
	
		
	}
	
	

}
