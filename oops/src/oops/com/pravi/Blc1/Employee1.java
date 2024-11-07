package oops.com.pravi.Blc1;
import java.util.*;
public class Employee1 
{
	public static void main(String[]args)
	{
		Employee emp1=new Employee();
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter the emp id:");
		emp1.employeeId=sc.nextInt();
		
		System.out.println("Enter the emp name :");
		emp1.employeeName=sc.next();
		
		System.out.println("enter the salary:");
		emp1.employeeSalary=sc.nextInt();
		emp1.getEmployeData();
		sc.close();
		
		System.out.println("============");
		
	   /*emp1.setEmployeData(100,"pravin",12000);
		emp1.getEmployeData();
		
		System.out.println("=============");
		
		Employee emp2 =new Employee();
		emp2.setEmployeData(200,"ravi",150000);
		emp2.getEmployeData();
		*/
		
		
		
		
	}
	

}
