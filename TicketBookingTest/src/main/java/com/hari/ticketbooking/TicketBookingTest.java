/**
 * 
 */
package com.hari.ticketbooking;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hari.ticketbooking.model.Ticket;
import com.hari.ticketbooking.service.TicketService;

/**
 * @author hp
 *
 */
@SpringBootApplication
public class TicketBookingTest implements CommandLineRunner{


	@Autowired
	private TicketService tickService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(TicketBookingTest.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// This code will runs only on sever startup    static data  or static scripts to execute this method is used.
		
		Ticket tickObj = new Ticket( "Harinath", "Banglore" , "America", new Date(), "harinath.reddy@gamil.com");
		tickService.createTicket(tickObj);
		
	}

}