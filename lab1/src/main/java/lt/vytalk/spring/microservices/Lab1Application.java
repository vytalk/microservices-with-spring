package lt.vytalk.spring.microservices;

import lt.vytalk.spring.microservices.model.Player;
import lt.vytalk.spring.microservices.model.Team;
import lt.vytalk.spring.microservices.repos.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class Lab1Application {

	@Autowired
	private TeamRepository teamRepository;

	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();

		Set<Player> set1 = new HashSet<>();
		set1.add(new Player("Tedis", "Metikas"));
		set1.add(new Player("Bedis", "Gynikas"));

		Team team = new Team();
		team.setLocation("Vilnius");
		team.setName("Grybai");
		team.setPlayers(set1);
		list.add(team);

		Set<Player> set2 = new HashSet<>();
		set2.add(new Player("Medis", "Stumikas"));

		team = new Team();
		team.setLocation("Kavarskas");
		team.setName("Kavarskas");
		team.setPlayers(set2);
		list.add(team);

		teamRepository.save(list);
	}

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}
}
