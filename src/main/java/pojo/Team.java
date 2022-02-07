package pojo;

import java.util.Arrays;

public class Team {
    private String name;
    private Player [] players;
    private Manager manager;


    public Team(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
        this.players = new Player[15]; // If there is a property that is the same for every object, we can hard-code it here
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", players=" + Arrays.toString(players) +
                ", manager=" + manager +
                '}';
    }
}
