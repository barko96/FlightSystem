package flights.controller.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import flights.model.Airways;
import flights.repository.AirwaysRepository;

@RestController
@RequestMapping("/api")
public class AirwaysController {

	@Autowired
	private AirwaysRepository airrepository;

	@GetMapping("/airways/{airwayId}")
	 public ResponseEntity < Airways > getEmployeeById(@PathVariable(value = "airwayId") int airwayId)
			    throws ResourceNotFoundException {
			        Airways airway = airrepository.findById(airwayId);
			           
			        return ResponseEntity.ok().body(airway);
}
}