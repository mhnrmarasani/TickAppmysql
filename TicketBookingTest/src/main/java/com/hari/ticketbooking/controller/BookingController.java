/**
 * 
 */
package com.hari.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hari.ticketbooking.model.Ticket;
import com.hari.ticketbooking.service.TicketService;

/**
 * @author hp
 *
 */
@RestController
@RequestMapping(value = "/TicketApp")
public class BookingController {
	
	@Autowired
	private TicketService tickService;
	
	@PostMapping(value="/createTicket")
	public Ticket CreateTicket(@RequestBody Ticket tickObj) {
		
		return tickService.createTicket(tickObj);
	}
	
	@GetMapping(value = "/all")
	public Iterable<Ticket> getAllTickets(){
		return tickService.retrieveAllTickets();
	}
	
	@GetMapping(value = "/{tickId}")
	public Ticket getTicket(@PathVariable("tickId") Integer tickId) {
		return tickService.getTicket(tickId);
	}
	
	
	//http://localhost:8080/1/mhnrmarasani@gmail.com
	
	@PutMapping(value= "/{tickId}/{email}")
	public Ticket updateTicket(@PathVariable("tickId") Integer tickId,
							   @PathVariable("email") String email) {
		
			return tickService.updateTicket(tickId,email);
	}
	
	@DeleteMapping(value="{tickId}")
	public void  deleteTicket(@PathVariable("tickId") Integer tickId) {
		tickService.deleteTicket(tickId);
	}
	
	

}
