package oops.com.pravi.Blc1;

public class FactoryElcdemo {

	public static void main(String[] args) 
	{
		Factory f1=new Factory("pravin",100,20000,"manager","latur");
		System.out.println(f1);
		
		System.out.println("=====================");
		
		Factory f2=new Factory("ravi",100,19000,"hr","hyd");
		System.out.println(f2);
				
		
	}

}
