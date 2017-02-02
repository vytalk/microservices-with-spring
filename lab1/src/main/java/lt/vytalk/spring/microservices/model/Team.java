package lt.vytalk.spring.microservices.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Team {

    @Id
    @GeneratedValue
    private Long id;

    private String location;

    private String name;

    private String mascotte;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="teamId")
    private Set<Player> players;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMascotte() {
        return mascotte;
    }

    public void setMascotte(String mascotte) {
        this.mascotte = mascotte;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

}
