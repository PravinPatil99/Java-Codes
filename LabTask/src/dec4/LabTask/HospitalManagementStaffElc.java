package dec4.LabTask;

public class HospitalManagementStaffElc 
{

	public static void main(String[] args) 
	{
		Doctor d=new Doctor("DR.Kiran",23,"Doctor","dermatologist");
		Nurse n=new Nurse("Dr.tanvi",22,"Nurse",10);
		d.work();
		System.err.println("---------------------------");
		n.work();
		System.err.println();
	
	}

}