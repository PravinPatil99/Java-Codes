package oops.com.pravi.Blc1;

//import java.util.Scanner;
public class MobileElcdemo {

	public static void main(String[] args) 
	{
		Mobile realme=new Mobile();
		
		//obj value getting through scanner class.
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the brand:");
		realme.mobileBrand=sc.next();
		
		System.out.println("Enter the series name is:");
		realme.mobileName=sc.next();
		
		System.out.println("Enter the mobile color:");
		realme.mobileColour=sc.next();
		
		System.out.println("Enter the mobile ram is:");
		realme.mobileRam=sc.nextInt();
		
		//System.out.println("Enter the mobile price");
		//realme.mobilePrice=sc.nextInt();
		
		realme.rateInfo();
		realme.mobileData();
	sc.close();
	*/

		
		realme.setMobiledetail("vivo","vy134","white",12);
		realme.rateInfo();
		realme.mobileData();
		
	
	
	}
}

