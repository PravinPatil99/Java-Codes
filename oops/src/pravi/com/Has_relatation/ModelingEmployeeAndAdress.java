package pravi.com.Has_relatation;

public class ModelingEmployeeAndAdress {

	public static void main(String[] args)
	{
		
		Address a=new Address("123 ELM Street","Sprinffield");
		Person p =new Person("john Doe",a);
		p.displayInfo();
		
		


	}

}
