package lt.vytalk.spring.microservices.repos;

import lt.vytalk.spring.microservices.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {
}
