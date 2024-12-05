package pravi.com.Has_relatation;

public class Employee 
{
	private int empID;
	private String empName;
	private Address1 address;
	
	public Employee(int empID, String empName, Address1 address) 
	{
		super();
		this.empID = empID;
		this.empName = empName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", address=" + address + "]";
	}
	
	

}
