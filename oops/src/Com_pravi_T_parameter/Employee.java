package Com_pravi_T_parameter;

import java.util.function.Consumer;

class emp 
{
	protected String empName;
	protected int empId;
	protected String department;
	protected int age;
	
	public emp(String empName, int empId, String department, int age) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.department = department;
		this.age = age;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "emp [empName=" + empName + ", empId=" + empId + ", department=" + department + ", age=" + age + "]";
	}
	
}
public class Employee 
{ 
	/*Consumer<emp> e1=Emp->e1.accept(new emp(null, 0, null, 0));
	system.out.println(e1);*/
	}
	
	

	


