package Com_pravi_PredefinedFunctionlInterface;

import java.util.function.Consumer;

public class CosumberDemo1 
{

	public static void main(String[] args) 
	{
		Consumer <Integer> c1=num->System.out.println("Integer type:"+num);
		c1.accept(12);
		
	Consumer<String> c2=str->str.compareToIgnoreCase(str);
		c2.accept("Patil");
		
		Consumer<Boolean> c3=bool->System.out.println("boolean type"+bool);
		c3.accept(true);
		
		Consumer<Customer> c4=cust->System.out.println(cust);
		c4.accept(new Customer(111));

	}

}
class Customer
{
	private int id;

	public Customer(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + "]";
	}
	
}
