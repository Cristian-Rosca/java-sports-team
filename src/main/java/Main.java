import pojo.Manager;
import pojo.Player;
import pojo.Team;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Cristian", "Midfield", 10, 3);

        Manager manager = new Manager ("Carlos Wynne");

        Team teamA = new Team("TeamA", manager);
    }

}
