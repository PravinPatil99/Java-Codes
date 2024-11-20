package Mcq;

 class laptop 
 {
	 void acesss()
	 {
		 System.out.println("copy java soft copy....");
		 
	 }
 }
 class Faculty
 {
	 static laptop password=new laptop();
	}
 class Student
 {
	 public static void main(String[] args) 
	 {
		 Faculty.password.acesss();
		
	}
 }