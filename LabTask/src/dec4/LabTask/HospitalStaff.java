package dec4.LabTask;

 class HospitalStaff 
{
	 protected  String name;
	 protected  int age;
	 protected  String role;
	
	public HospitalStaff(String name, int age, String role) {
		super();
		this.name = name;
		this.age = age;
		this.role = role;
	}
	public void work()
	{
		System.out.println(name +" is working");
		System.out.println(role +" is working");
		
	}
	
	 }
 class Doctor extends HospitalStaff 
 {
	 protected  String specialization;

	public Doctor(String name, int age, String role, String specialization) {
		super(name, age, role);
		this.specialization = specialization;
	}
	@Override
	 public void work()
	 {
		super.work();
		 System.out.println(role + " " +name +" with specialization in "+specialization +" is treating patient");
	 }
	 
 }
 class Nurse extends HospitalStaff
 {
	protected  int yearOfExp;

	public Nurse(String name, int age, String role, int yearOfExp) {
		super(name, age, role);
		
		this.yearOfExp = yearOfExp;
	}
	@Override
	public void work()
	{
		super.work();
		System.out.println(role + " " + name + " with " + yearOfExp + " years of experience is taking care of patients.");
	}
	 
 }
