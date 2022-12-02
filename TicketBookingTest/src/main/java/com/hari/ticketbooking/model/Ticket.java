/**
 * 
 */
package com.hari.ticketbooking.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author hp
 *
 */
@Entity
@Table(name="tbl_ticket")
public class Ticket {
	
	
	@Id //for primary key
	@GeneratedValue(strategy = GenerationType.AUTO)  //for generation sequence
	@Column(name="passenger_id")
	private Integer id;
	
	@Column(name="passenger_name")
	private String passangerName;

	@Column(name="source_station")
	private String sourceStation;
	
	@Column(name="destination_station")
	private String destination;
	
	
	@Column(name="travel_date")
	private Date travel_date;
	
	@Column(name="email")
	private String email;


	public String getPassangerName() {
		return passangerName;
	}


	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}


	public String getSourceStation() {
		return sourceStation;
	}


	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public Date getTravel_date() {
		return travel_date;
	}


	public void setTravel_date(Date travel_date) {
		this.travel_date = travel_date;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Ticket(String passangerName, String sourceStation, String destination, Date travel_date, String email) {
		super();
		this.passangerName = passangerName;
		this.sourceStation = sourceStation;
		this.destination = destination;
		this.travel_date = new Date();
		this.email = email;
	}


	public Ticket() {};



 
	
	
	
	
	
	
}
