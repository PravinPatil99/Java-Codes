package SetA;

public class MovieExperience 
{

	public static void main(String[] args) 
	{
		Theater t= new Theater("Generic theater",true);
		t.getTheaterDetail();
		System.out.println();
		
		Theater i=new IMAXTheater("Imax grand",true);
		i.getTheaterDetail();
		System.out.println();
		
		Theater p=new PremiumTheater("PVR LATUR",true);
		p.getTheaterDetail();
		System.out.println();
		
		Theater r=new RegularTheater("yashoda",true);
		p.getTheaterDetail();
		

	}

}
