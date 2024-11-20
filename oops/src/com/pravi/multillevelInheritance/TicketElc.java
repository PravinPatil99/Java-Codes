package com.pravi.multillevelInheritance;

public class TicketElc 
{

	public static void main(String[] args) 
	{
		Ticket regularTicket = new Ticket("Concert", 201, 50);
		System.out.println("\tRegular Ticket:\n");
		regularTicket.displayTicket();
		
		VipTicket vipTicket = new VipTicket("VIP Concert", 201, 100.0, "Backstage Access");
		System.out.println("\tVipTicket: \n");
		vipTicket.displayTicket();
		
        StudentTicket studentTicket = new StudentTicket("Student Event", 301, 30.0, true);
        System.out.println("\tStudentTicket: \n");
        studentTicket.displayTicket();
         
		
	}

}
