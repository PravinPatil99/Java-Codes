package oops.com.pravi.Blc1;
import java.util.*;
public class BulletElc1 
{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		BulletBlc b1=new BulletBlc();
		
		
		
		System.out.println("Enter the name:");
		b1.name=sc.nextLine();
		
		System.out.println("Ente the model:");
		b1.model=sc.nextLine();
		
		System.out.println("Enter the gear :");
	    b1.gear=sc.nextInt();
		
		
		System.out.println("Enter the colour :");
		b1.colour=sc.next();
		
		
		System.out.println("Enter the price :");
		b1.price=sc.nextDouble();
		
		
		System.out.println("automatic  :");
		b1.automatic=sc.nextBoolean();
		
		
		b1.getBulletBlc();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
