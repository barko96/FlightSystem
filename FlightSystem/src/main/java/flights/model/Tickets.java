package flights.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tickets")
public class Tickets {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tid")
	private int ticketId;
	
	
	
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "FlyNo")
	private Flights  flightss;



	public Tickets() {
		
	}



	public int getTicketId() {
		return ticketId;
	}



	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}



	public Flights getFlightss() {
		return flightss;
	}



	public void setFlightss(Flights flightss) {
		this.flightss = flightss;
	}



	@Override
	public String toString() {
		return "Tickets [ticketId=" + ticketId + ", flightss=" + flightss + "]";
	}
	
	
	
	
}
