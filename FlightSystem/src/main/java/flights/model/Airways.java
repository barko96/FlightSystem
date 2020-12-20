package flights.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "airways")
public class Airways {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "airwayid")
	private int airwayId;
	
	@Column(name = "brand")
	private String brand;
	
	//one to side of the relationship/ @OneToMany
	//one airway has multiple flights
	@OneToMany(mappedBy = "airways"  ,cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	private List <Flights> flights;

	public Airways(String brand) {
		this.brand = brand;
		;
	}

	public Airways() {
		
	}

	public int getAirwayId() {
		return airwayId;
	}

	public void setAirwayId(int airwayId) {
		this.airwayId = airwayId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public List<Flights> getFlights() {
		return flights;
	}

	public void setFlights(List<Flights> flights) {
		this.flights = flights;
	}

	public void addFlight(Flights tempflight) {
		if(flights== null) {
			flights= new ArrayList<Flights>();
		}
		flights.add(tempflight);
		tempflight.setAirways(this);
	}


	
	
}
