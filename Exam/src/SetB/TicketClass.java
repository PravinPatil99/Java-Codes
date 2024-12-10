package SetB;

public class TicketClass 
{
	protected String  source;
	protected String  destination;
	protected double price;
	
	public TicketClass(String source, String destination, double price) {
		super();
		this.source = source;
		this.destination = destination;
		this.price = price;
	}
	public void displayTicketDetails() 
	{
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		System.out.println("price of the ticket:"+price);
		
		}
	
}

class TrainTicket extends TicketClass
{
	protected int trainNumber;

	public TrainTicket(String source, String destination, double price, int trainNumber) {
		super(source, destination, price);
		this.trainNumber = trainNumber;
	}
	@Override
	public void displayTicketDetails() 
	{
		System.err.println("Train ticket details:\n");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		System.out.println("price of the ticket:"+price);
		System.out.println("Train number:"+trainNumber);
		}
	}
class BustTicket extends TicketClass
{
	protected String busCompnay;

	public BustTicket(String source, String destination, double price, String busCompnay) {
		super(source, destination, price);
		this.busCompnay = busCompnay;
	}
	@Override
	public void displayTicketDetails() 
	{
		System.err.println("\nBus ticket details:\n");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		System.out.println("price of the ticket:"+price);
		System.out.println("bus compnay:"+busCompnay);
		}
	
}

class FlightClass extends TicketClass
{
	protected String flightNumber;

	
	public FlightClass(String source, String destination, double price, String  flightNumber) {
		super(source, destination, price);
		this.flightNumber = flightNumber;
	}
	@Override
	public void displayTicketDetails() 
	{
		System.err.println("\nFlight ticket details:\n");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		System.out.println("price of the ticket:"+price);
		System.out.println("Flight number:"+flightNumber);
		
	}
	}


