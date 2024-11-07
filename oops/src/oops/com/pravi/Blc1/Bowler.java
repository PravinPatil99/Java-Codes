package oops.com.pravi.Blc1;

public class Bowler 
{
	  private String name ;
	  private int wickets;
	  private int matches;
	  private int balls_bowled;
      private int runs_conceded;
      
      public void bowlerDetail(String name,int wickets,int matches,int balls_bowled,int runs_conceded)
      {
    	  this.name=name;
    	  this. wickets= wickets;
    	  this.matches=matches;
    	  this.balls_bowled=balls_bowled;
    	  this. runs_conceded=runs_conceded;
    	  }
      
      public void computeBowlingAverage()
      {
      
    	  if( runs_conceded<=0&&wickets<=0)
    		  {
    		  
    		  System.err.println("Ressign the value");
    		 }
    	  else if(runs_conceded>0&&wickets>0&&matches<=0)
    	  {
    		  System.err.println(" Matches are o  can't find avg");
    	  }
    	  else
    		  
               System.out.println("the bowling avg :"+((double)runs_conceded/wickets));
     
           }

      public void computeStrikeRate()
      {
    	  if(runs_conceded>0 && balls_bowled>0 && matches<=0)
    	  {
    		  System.err.println(" matches are o can't find strike rate");
    	  }
    	  else
    	  System.out.println("Strike rate:"+((double)runs_conceded/balls_bowled));
      }
      
    
      
   
	public String toString() {
		return "Bowler [name=" + name + ", wickets=" + wickets + ", matches=" + matches + ", balls_bowled="
				+ balls_bowled + ", runs_conceded=" + runs_conceded + "]";
	}
}

