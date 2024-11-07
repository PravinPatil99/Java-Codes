package oops.com.pravi.Blc1;

public class Employee4 
{
	private int employeeNumber;
	private String employeeName;
	private double employeeSalary;
	public Employee4(int employeeNumber, String employeeName, double employeeSalary) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public void getSalary()
	{
		if(employeeSalary >= 60000)
		{
			System.out.println("Employee is Developer");
			}
		else if(employeeSalary>=40000 )
		{
			System.out.println("Employee is Designer");
		}
		else if(employeeSalary<40000)
		{
			System.out.println("Employee is Tester");
		}
	}
	
	@Override
	public String toString() {
		return "Employee4 [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	
	
	
	

}
