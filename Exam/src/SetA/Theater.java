package SetA;

 class Theater
{
	protected String theaterName;
	
	protected boolean is3DEnabled ;

	public Theater(String theaterName, boolean is3dEnabled) {
		super();
		this.theaterName = theaterName;
		is3DEnabled = is3dEnabled;
	}
	
	public Theater  getTheaterDetail()
	{
		System.out.println("name of the theater:"+theaterName);
		System.out.println("theater support 3d movie:"+is3DEnabled);
		return this;
		
		}
}
 
 class IMAXTheater extends Theater
 {
	
	public IMAXTheater(String theaterName, boolean is3dEnabled) {
		super(theaterName, is3dEnabled);
	}

	@Override
	 public IMAXTheater  getTheaterDetail()
		{
			System.out.println("name of the theater:"+theaterName);
			System.out.println("theater support 3d movie:"+is3DEnabled);
			return this;
			
			}
	 }
 
 class  PremiumTheater extends Theater
 {

	public PremiumTheater(String theaterName, boolean is3dEnabled) {
		super(theaterName, is3dEnabled);
	}
	
	@Override
	 public PremiumTheater  getTheaterDetail()
		{
			System.out.println("name of the theater:"+theaterName);
			System.out.println("theater support 3d movie:"+is3DEnabled);
			return this;
			
			}
	 
 }
 class  RegularTheater  extends Theater
 {
	public RegularTheater(String theaterName, boolean is3dEnabled) {
		super(theaterName, is3dEnabled);
	}
	@Override
	 public RegularTheater  getTheaterDetail()
		{
			System.out.println("name of the theater:"+theaterName);
			System.out.println("theater support 3d movie:"+is3DEnabled);
			return this;
			
			}
	 
 }

 