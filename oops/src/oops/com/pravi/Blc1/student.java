package oops.com.pravi.Blc1;

public class student 
{
      private int rollNumber;
	  private String studentName;
	  private String studentAdress;
	  static  String collegeName="dscl Latur";
	  static  String courseName="full stack java";
	  
	  
	  public void setStudentData(int rollNumber,String studentName,String studentAdress)
	  {
		  this.rollNumber=rollNumber;
		  this.studentName=studentName;
		  this.studentAdress=studentAdress;
		  
	  }


	@Override
	public String toString() {
		return "student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", studentAdress=" + studentAdress
				+ "collegeName="+ collegeName +",courseName="+ courseName +" ]";
	}
	  

}
