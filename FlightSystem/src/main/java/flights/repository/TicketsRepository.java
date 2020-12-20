package flights.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import flights.model.Tickets;

public interface TicketsRepository extends JpaRepository<Tickets, Long>{ 

}
