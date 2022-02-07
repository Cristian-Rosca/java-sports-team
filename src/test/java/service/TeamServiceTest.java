package service;

import org.junit.jupiter.api.Test;
import pojo.Manager;
import pojo.Team;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TeamServiceTest {

    @Test // have to include @Test before writing the test
    public void canCountEmptySpacesOnTeamWhenEmpty () {
        // Given
        Manager manager = new Manager("test Manager");

        Team team = new Team("teamA", manager);

        TeamService underTest = new TeamService();

        // When
        int actual = underTest.countEmptySpacesOnTeam(team);

        // Then
        int expected = 15;
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void canCountEmptySpacesOnTeamWithOnePlayer () {
        // Given
        Manager manager = new Manager("test Manager");

        Team team = new Team("teamA", manager);

        TeamService underTest = new TeamService();

        // When
        int actual = underTest.countEmptySpacesOnTeam(team);

        // Then
        int expected = 15;
        assertThat(actual).isEqualTo(expected);

    }
}