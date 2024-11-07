package oops.com.pravi.Blc1;

public class Employee3 
{
	private String firstName;
	private String lastName;
	private int     employeeId;
	private int    noOfProject;
	private  double empSalary;
	public Employee3(String firstName, String lastName, int employeeId, int noOfProject, double empSalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.noOfProject = noOfProject;
		this.empSalary = empSalary;
	}
	
	public void calculateSalary()
    {
		if(noOfProject <=0)
		{
			System.out.println("Invalid No of Projects.");
			
		}
		else
		{
			if(this.noOfProject > 20)
			{
				this.empSalary += 15000;
			}
			else if(this.noOfProject >10)
			{
				this.empSalary += 10000;
			}
			else if(this.noOfProject >5)
			{
				this.empSalary +=5000;
			}
			
			
		}
		
		}
	

	@Override
	public String toString() {
		return "Employee3 [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", noOfProject=" + noOfProject + ", empSalary=" + empSalary + "]";
	}
}
