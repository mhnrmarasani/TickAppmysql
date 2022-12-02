/**
 * 
 */
package com.hari.ticketbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hari.ticketbooking.dao.TicketDAO;
import com.hari.ticketbooking.model.Ticket;

/**
 * @author hp
 *
 */
@Service
public class TicketService {

	@Autowired
	private TicketDAO ticketDao;
	
	
	public Iterable<Ticket> retrieveAllTickets(){
		return ticketDao.findAll();//select * from tablename;
	}
	
	
	public Ticket createTicket(Ticket obj) {
		return ticketDao.save(obj);//create
	}
	
	
	public Ticket getTicket(Integer ticketId) {
		return ticketDao.findById(ticketId).orElse(new Ticket());//optional to handle null pointer exceptions
	}
	
	
	public Ticket updateTicket(Integer ticketId, String email) {
	
		Ticket obj = getTicket(ticketId);
		obj.setEmail(email);
		return ticketDao.save(obj);
	}
	
	public void deleteTicket(Integer ticketId) {
		
		ticketDao.deleteById(ticketId);
	}
	
	
}
