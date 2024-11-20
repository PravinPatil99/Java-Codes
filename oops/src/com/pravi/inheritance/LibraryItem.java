package com.pravi.inheritance;

class LibraryItem 
{
	protected String title;
	
	public LibraryItem(String title) {
		super();
		this.title = title;
	
	}

	public void displayInfo()
	{
		System.out.println("Titile:"+title);
		
	}
	}
class Book extends  LibraryItem 
{
	protected String author;
	
	public Book(String title, String author) {
		super(title);
		this.author = author;
	}
       public void displayBookInfo()
	{
		super.displayInfo();
		System.out.println("author :"+author);
		
	}
}
class Ebook extends Book
{
	protected String fileFormat;
	
	public Ebook(String title, String author, String fileFormat) {
		super(title, author);
		this.fileFormat = fileFormat;
	}
       public void displayEbookInfo()
	{
		super.displayBookInfo();
		System.out.println("file foramt:"+ fileFormat);
	}
}

