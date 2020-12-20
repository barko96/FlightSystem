package flights.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "flight")
public class Flights {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Fid")
	private int flightId;

	@Column(name = "Fromm")
	private String From;

	@Column(name = "too")
	private String toWhere;

	//many side of the relationship, @ManyToOne
	//Foreign key => joinColumn
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "aid")
	private Airways airways;

	@OneToMany(mappedBy = "flightss"  ,cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	private List <Tickets> tickets;
	
	
	public Flights() {
		
	}

	public Flights(String from, String toWhere, Airways airways) {
		
		From = from;
		this.toWhere = toWhere;
		this.airways = airways;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFrom() {
		return From;
	}

	public void setFrom(String from) {
		From = from;
	}

	public String getToWhere() {
		return toWhere;
	}

	public void setToWhere(String toWhere) {
		this.toWhere = toWhere;
	}

	public Airways getAirways() {
		return airways;
	}

	public void setAirways(Airways airways) {
		this.airways = airways;
	}
	
	
	

}
