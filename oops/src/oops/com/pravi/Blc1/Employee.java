package oops.com.pravi.Blc1;

public class Employee 
{
	 int employeeId;
	 String employeeName;
     double employeeSalary;
 

     public void  setEmployeData(int id, String name,double salary)
     {
    	 employeeId=id;
    	 employeeName=name;
    	 employeeSalary=salary;
    	 
    	 
     }
     public void getEmployeData()
     {
    	 System.out.println("The id of the emp is :"+employeeId);
    	 System.out.println("The name of the emp is :"+employeeName);
    	 System.out.println("The salary of thr emp is :"+employeeSalary);
     }
     
	
}
