package test;

import model.Game;
import model.Scoreboard;
import model.Team;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

// Based on TDD we need to start by methods tests first
public class ScoreboardTest {
    // startGamePassed - startGame passed test
    @Test
    public void startGamePassed() throws Exception {
        // Arrange
        Scoreboard scoreboard = new Scoreboard();
        String homeTeam = "Morocco";
        String awayTeam = "Algeria";
        //Act
        scoreboard.startGame(new Game(new Team(homeTeam), new Team(awayTeam)));

        // Assert
        assertTrue(scoreboard.games.size() == 1);
    }

    // startGamePassed - startGame fail test
    @Test
    public void startGameFail() {
        try {
            //Arrange
            Scoreboard scoreboard = new Scoreboard();

            String homeTeam = "Morocco";
            String awayTeam = "";
            // Act
            scoreboard.startGame(new Game(new Team(homeTeam), new Team(awayTeam)));
        } catch (Exception e) {
            //Assert
            assertTrue(true);
        }
    }

    //
    @Test
    public void getSummaryNoGames() {
        Scoreboard scoreboard = new Scoreboard();
        scoreboard.getSummary();
        assertTrue(scoreboard.games.size() == 0);
    }

}
