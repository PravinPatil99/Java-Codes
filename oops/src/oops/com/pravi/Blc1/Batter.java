package oops.com.pravi.Blc1;

public class Batter
{
	private String name;
	private int run;
	private int matches;
	private float batting_avg;
	
	public void  batterDetails(String name,int run,int matches)
	
	{
		this.name= name;
		this.run=run;
		this. matches=matches;
		//this.batting_avg=batting_avg;
		
	}
	
	public void computeBattingAverage()
	{
		if(run<=0 && matches<=0)
	  {
			System.err.println("run and matche is o");
		}
		
		else 
		System.out.println("Batting avg  is :"+(double)(run/matches));
	}

	public void  getStatistics()
	{  
		System.out.println("Batter name is:"+name);
		System.out.println("batter run is:"+run);
		System.out.println("batter matches is :"+matches);
	
	}


	

}
