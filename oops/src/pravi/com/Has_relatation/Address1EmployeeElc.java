package pravi.com.Has_relatation;

public class Address1EmployeeElc {

	public static void main(String[] args) 
	{
		Address1 a= new Address1("ausa","latur","Mharashtra");
		Employee e= new Employee(10065,"pravin",a);
		System.out.println(e);

	}

}
