package pravi.com.Has_relatation;

public class Address1 
{
	private String cityName;
	private  String districtName;
	private String stateName;
	
	public Address1(String cityName, String districtName, String stateName) 
	{
		
		super();
		this.cityName = cityName;
		this.districtName = districtName;
		this.stateName = stateName;
	}

	@Override
	public String toString() 
	{
		return "Address1 [cityName=" + cityName + ", districtName=" + districtName + ", stateName=" + stateName + "]";
	}
	
	
	
	

}
