package flights.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import flights.model.Airways;

@Repository
public interface AirwaysRepository extends JpaRepository<Airways, Long>{ 
	
	Airways findById(@Param("airwayId") int airwayId);
}
