package AbstractMethogDec09Task;

  abstract class Book 
{
	 protected String title;

	public Book(String title) {
		super();
		this.title = title;
	}

	 abstract void setTitle(String title); 
	
	
	 public String getTitle()
	{
		return title;
	}
	 
}
  
  class myBook extends Book
  {
	public myBook(String title) {
		super(title);
		
	}
	@Override
	  void setTitle(String title)
	{
			this.title = title;
		}
    @Override
    public String getTitle() {
		return title;
	}
    
  }
