package com.pravi.Exam;

public class Cricket 
{
	protected String matchType;
	protected boolean isDayMatch;
	
	public Cricket(String matchType, boolean isDayMatch) {
		super();
		this.matchType = matchType;
		this.isDayMatch = isDayMatch;
	}
	
	public String  getMatchDetails(String  getMatchDetails)
	{
		return getMatchDetails;
		
	}

	@Override
	public String toString() {
		return "Cricket [matchType=" + matchType + ", isDayMatch=" + isDayMatch + "]";
	}
	
}

class TestMatch extends Cricket
{

	public TestMatch(String matchType, boolean isDayMatch) {
		super(matchType, isDayMatch);
	}
	public String  getMatchDetails(String  getMatchDetails)
	{
		return getMatchDetails;
		
	}
	@Override
	public String toString() {
		return "TestMatch [matchType=" + matchType + ", isDayMatch=" + isDayMatch + "]";
	}
	
	
	
}
class ODIMatch extends Cricket 
{
	public ODIMatch(String matchType, boolean isDayMatch) {
		super(matchType, isDayMatch);
	}

	@Override
	public String getMatchDetails(String  getMatchDetails)
	{
		return getMatchDetails;
		
	}

	@Override
	public String toString() {
		return "ODIMatch [matchType=" + matchType + ", isDayMatch=" + isDayMatch + "]";
	}

	
	
}

class T20Match extends  Cricket
{
	public T20Match(String matchType, boolean isDayMatch) {
		super(matchType, isDayMatch);
	}
	@Override
	public String  getMatchDetails(String  getMatchDetails)
	{
		return getMatchDetails;
		
	
	
	
}
	@Override
	public String toString() {
		return "T20Match [matchType=" + matchType + ", isDayMatch=" + isDayMatch + "]";
	}
}


