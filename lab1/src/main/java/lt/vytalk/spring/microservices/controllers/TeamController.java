package lt.vytalk.spring.microservices.controllers;

import lt.vytalk.spring.microservices.model.Team;
import lt.vytalk.spring.microservices.repos.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @RequestMapping("/teams")
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }

    @RequestMapping("/teams/{id}")
    public Team getTeam(@PathVariable Long id) {
        return teamRepository.findOne(id);
    }

}
