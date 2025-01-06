package RecordClass;

public record productRecord(Integer productID,String productName) 
{
	

	public static void main(String[] args) 
	{
		productRecord p1= new productRecord(11,"laptop");
		productRecord p2=new productRecord(11,"laptop");
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p1.equals(p2));
	System.out.println(p1.productName());
	p2.getClass();

	}

}
