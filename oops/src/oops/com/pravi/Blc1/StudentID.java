package oops.com.pravi.Blc1;

public class StudentID 
{
	 int studentId;
	 String studentName;
	 int marks;
	char grade;
	
	public void calculateGrade()
	{
		if(marks>=90)
		{
			grade ='A';
			}
		else if(marks>81 && marks<90 )
		{
			grade ='B';
		}
		else if(marks >71 && marks<80)
		{
			grade='C';
		}
		else if(marks>61 && marks<70)
		{
			grade='D';
			
		}
		else if  (marks<60)
		{
			grade='E';
		}
		
	}
	
	
	public void setStudentData(int studentId,String studentName,int marks)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.marks=marks;
		
		
	}
	public void getstudentData()
	{
		System.out.println("Student id is :"+studentId);
		System.out.println("Student name  is :"+studentName);
		System.out.println("Student marks is :"+marks);
		System.out.println("Student grade is :"+grade );
		
	}
	
	

}
