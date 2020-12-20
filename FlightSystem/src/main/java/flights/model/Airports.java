package flights.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airports")
public class Airports {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "portid")
	private int portid;

	@Column(name = "name")
	private String airportName;

	public Airports(String airportName) {
		this.airportName = airportName;
	}

	public Airports() {
		;
	}

	public int getPortid() {
		return portid;
	}

	public void setPortid(int portid) {
		this.portid = portid;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

}
