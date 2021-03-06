package service;

import pojo.Player;
import pojo.Team;

public class TeamService {

    // If we had a Data Access Object (DAO), we would definitely need a constructor for service class

    // Count empty space on team
    // return int
    // parameters : Team

    public int countEmptySpacesOnTeam (Team team) {
//       foreach loop method - this one is easier to set up in this case
//        int count = 0;
//        for (Player player : team.getPlayers()) // foreach loop. Can use a fori loop also
//            if (player == null) {
//                count++;
//            }

        // fori method - this looping method has more control
        Player [] players = team.getPlayers(); // this one is more useful if we start from end of array, if we want to stop halfway, if we want to increment by 2 and so on
        int count = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                count++;
            }
        }
        return count;
    }

    public void addPlayerToTeam (Team team, Player player) throws Exception { // include "throws exception" in first line
        // Check if there is space on the team
        int space = countEmptySpacesOnTeam(team);
        // If there is a space, add the player
        if (space > 0) {
            for (int i = 0; i < team.getPlayers().length; i++) {
                if (team.getPlayers()[i] == null) {
                    team.getPlayers() [i] = player;
                    break;
                }
            }
        }
        else throw new Exception();
    }

}
