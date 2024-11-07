package oops.com.pravi.Blc1;

import java.util.Scanner;

public class BowlerElcdemo 
{
	public static void main(String[]args)
	{
	 Bowler  b1= new Bowler();
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter the Name:");
	 String name=sc.nextLine();
	 
	 System.out.println("Enter the wicket:");
	 int wickets=sc.nextInt();
	 
	 System.out.println("Enter the matches:");
	 int matches=sc.nextInt();
	 
	 System.out.println("Enter the balls_bowled:");
	 int ball_bowled=sc.nextInt();
	 
	 System.out.println("Enter the runs_conceded:");
	 int run=sc.nextInt();
	 
     b1.bowlerDetail(name,wickets,matches,ball_bowled,run);
     
	b1.computeBowlingAverage();
	System.out.println("====================");
	b1.computeStrikeRate();
	System.out.println("====================");
    System.out.println(b1);

    sc.close();
}

}