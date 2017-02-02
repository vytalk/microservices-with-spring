package lt.vytalk.spring.microservices.repos;

import lt.vytalk.spring.microservices.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "players", rel="player")
public interface PlayerRepository extends CrudRepository<Player, Long>{
}
