package AbstractMethogDec09Task.copy;

 abstract class Student 
{
	 protected String studentName;
	 protected String studentClass;
	protected  static int  totalNoOfStudet;
	
	 abstract public  int getPercentage();
	
	 
	public static void getTotalNoOfStudent(int student)
	{
		System.out.println("number of student:"+totalNoOfStudet);
	}
	
	public Student() {
		super();
	}


	public Student(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
	}

	 
	
}
 
 class ScienceStudent extends Student
 {
	 private int physicsMark;
	 private int chemistryMark;
	 private int mathMark;
	
	public ScienceStudent(String studentName, String studentClass, int physicsMark, int chemistryMark, int mathMark) {
		super(studentName, studentClass);
		this.physicsMark = physicsMark;
		this.chemistryMark = chemistryMark;
		this.mathMark = mathMark;
	}
	
	@Override
	public int getPercentage()
	{
		
				if(physicsMark<0 ||chemistryMark<0 ||mathMark<0)
				{
					System.out.println("marks are invalid");
				}
				
				return (physicsMark+chemistryMark+mathMark)/3;
				
					
				}

	 
	
	
	}
	
 
 
 class HistoryStudent extends Student
 {
	 private int historyMark;
	 private int civicMark;
	
	public HistoryStudent(String studentName, String studentClass, int historyMark, int civicMark) {
		super(studentName, studentClass);
		this.historyMark = historyMark;
		this.civicMark = civicMark;
	}
	 
		@Override
		public int getPercentage()
		{
			
					if(historyMark<0 ||civicMark<0)
					{
						System.out.println("marks are invalid");
					}
					
					return (historyMark+civicMark)/2;
					
						
		}

		@Override
		public String toString() {
			return "HistoryStudent [historyMark=" + historyMark + ", civicMark=" + civicMark + ", studentName="
					+ studentName + ", studentClass=" + studentClass + "]";
		}

		
		
 }
 


