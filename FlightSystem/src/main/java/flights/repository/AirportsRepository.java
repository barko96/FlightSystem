package flights.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import flights.model.Airports;

public interface AirportsRepository extends JpaRepository<Airports, Long> {

}
