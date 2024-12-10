package SetB;

public class TicketBookingSystem 
{
	public static void main(String[] args) 
	{
		TrainTicket t=new TrainTicket("City A","City B",50,123);
		t.displayTicketDetails();
		
		BustTicket b=new BustTicket("City x","City y",30,"XYZ Bus Compnay");
		b.displayTicketDetails();
		
		FlightClass f=new FlightClass("City p","City Q",200,"abc123");
		f.displayTicketDetails();
	}

}
