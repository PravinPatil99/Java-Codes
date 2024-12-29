package abstractDemo;

abstract class student 
{
	protected String studntName;
	protected String studentClass;
	protected static int totalNoOfStudent;

	abstract public int getPercentage();
	
	public static int getTotalStudent(int student)
	{
		return student;
		
	}
		public student() {
		super();
	}

		/**
		 * @param studntName
		 * @param studentClass
		 */
		public student(String studntName, String studentClass) {
			super();
			this.studntName = studntName;
			this.studentClass = studentClass;
		}

		@Override
		public String toString() {
			return "student [studntName=" + studntName + ", studentClass=" + studentClass + "]";
		}

		

		
}

	class ScienceStudent extends student
	{
		private int physicsMarks;
		private int chemistryMarks;
		private int mathMarks;
		
	public ScienceStudent(String studntName,String studentClass,int physicsMarks, int chemistryMarks, int mathMarks) {
			super();
			this.physicsMarks = physicsMarks;
			this.chemistryMarks = chemistryMarks;
			this.mathMarks = mathMarks;
		}


		@Override 
		public int getPercentage()
		{
			
			return (physicsMarks+chemistryMarks+mathMarks)/3;
			
		}
		
		@Override
		public String toString() {
			return "ScienceStudent [physicsMarks=" + physicsMarks + ", chemistryMarks=" + chemistryMarks
					+ ", mathMarks=" + mathMarks + ", studntName=" + studntName + ", studentClass=" + studentClass
					+ "]";
		}





		class HistoryStudent extends student
	{
		private int historyMarks;
		private int civicsMark;
		
		public HistoryStudent(int historyMarks, int civicsMark) 
		{
			super();
			this.historyMarks = historyMarks;
			this.civicsMark = civicsMark;
		}
			@Override
			public int getPercentage()
			{
				return historyMarks+civicsMark/2;
				
				
			}
			@Override
			public String toString() {
				return "HistoryStudent [historyMarks=" + historyMarks + ", civicsMark=" + civicsMark + "]";
			}
			
		}
	}
		
		
		
	
	
	
	
