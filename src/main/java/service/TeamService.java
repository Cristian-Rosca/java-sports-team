package service;

import pojo.Player;
import pojo.Team;

public class TeamService {

    // If we had a Data Access Object (DAO), we would definitely need a constructor for service class

    // Count empty space on team
    // return int
    // parameters : Team

    public int countEmptySpacesOnTeam (Team team) {
        int count = 0;
        for (Player player : team.getPlayers()) // foreach loop. Can use a fori loop also
            if (player == null) {
                count++;
            }
        return count;
    }

}
