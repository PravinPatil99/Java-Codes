package SetB;

class AirStrike 
{
	protected String airStrike;
	protected String airStrikeDetails;
	
	public AirStrike(String airStrike, String airStrikeDetails) {
		super();
		this.airStrike = airStrike;
		this.airStrikeDetails = airStrikeDetails;
	}

public AirStrike  getAirstrikePlan()
	{
		
		System.out.println("Generating a generic airstrike plan...");

		return this;
		}
}

class PrecisionAirStrike extends AirStrike
{ 
	public PrecisionAirStrike(String airStrike, String airStrikeDetails) {
		super(airStrike, airStrikeDetails);
	}
	@Override
	public PrecisionAirStrike   getAirstrikePlan()
	{
		
		System.out.println("Generating a precision airstrike plan...");
		System.out.println("Targeting coordinates locked. Minimum collateral damage ensured.");
		return this;
		
		
		}
}

 class CarpetBombingAirstrike extends AirStrike
 {

	public CarpetBombingAirstrike(String airStrike, String airStrikeDetails) {
		super(airStrike, airStrikeDetails);
	}
	@Override
	public CarpetBombingAirstrike   getAirstrikePlan()
	{
		
		System.out.println("Generating a carpet bombing airstrike plan...");
		System.out.println("All coordinates in a 5km radius will be bombed for maximum impact.");
		return this;
		
		}
	 }
 
 