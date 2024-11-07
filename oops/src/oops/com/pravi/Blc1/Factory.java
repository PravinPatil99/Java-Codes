package oops.com.pravi.Blc1;

public class Factory 
{
	private String employeeName;
	private int    employeeId;
	private double empSalary;
	private String empPosition;
	private String empCity;
	
	@Override
	public String toString() 
	{
		return "Factory [employeeName=" + employeeName + ", employeeId=" + employeeId + ", empSalary=" + empSalary
				+ ", empPosition=" + empPosition + ", empCity=" + empCity + "]";
	}
	
	
	
	public Factory(String employeeName, int employeeId, double empSalary, String empPosition, String empCity) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.empSalary = empSalary;
		this.empPosition = empPosition;
		this.empCity = empCity;
	}
	

     

}
