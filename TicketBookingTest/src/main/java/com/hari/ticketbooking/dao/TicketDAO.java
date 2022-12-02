/**
 * 
 */
package com.hari.ticketbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hari.ticketbooking.model.Ticket;

/**
 * @author hp
 *
 */
@Repository
public interface TicketDAO extends CrudRepository <Ticket, Integer>
{

	//this dao help for all CRUD operations
	//CREATE/insert READ(select) UPDATE and DELETE
	
	
	
}
