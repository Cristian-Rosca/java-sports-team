import pojo.Manager;
import pojo.Player;
import pojo.Team;
import service.TeamService;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Cristian", "Midfield", 10, 3);

        Manager manager = new Manager ("Carlos Wynne");

        Team teamA = new Team("TeamA", manager);

        TeamService teamService = new TeamService();

        int teamSpace = teamService.countEmptySpacesOnTeam(teamA);

        System.out.println(teamSpace);

        try {
            teamService.addPlayerToTeam(teamA, player);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("team is full");
        }

        int teamSpaceAfter = teamService.countEmptySpacesOnTeam(teamA);
        System.out.println(teamSpaceAfter);
    }


}
