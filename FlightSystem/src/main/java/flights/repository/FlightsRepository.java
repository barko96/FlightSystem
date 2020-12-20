package flights.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import flights.model.Flights;

public interface FlightsRepository extends JpaRepository<Flights, Long> {

}
