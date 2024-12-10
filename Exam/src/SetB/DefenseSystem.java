package SetB;

public class DefenseSystem 
{

	public static void main(String[] args) 
	{
		AirStrike a=new AirStrike("Generic airstike paln","Basic mission details");
		
		a.getAirstrikePlan();
		
		PrecisionAirStrike p=new PrecisionAirStrike("Prescision Strike","high accurancy mission");
		p.getAirstrikePlan();
		
		CarpetBombingAirstrike c=new CarpetBombingAirstrike("carpet bombing","wide area detruction");
		c.getAirstrikePlan();
		
		}
	}
	


