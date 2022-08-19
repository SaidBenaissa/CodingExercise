package test;

import model.Game;
import model.Scoreboard;
import model.Team;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

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

    // getSummary pass test
    @Test
    public void getSummaryPass() throws Exception {
        Scoreboard scoreboard = new Scoreboard();
        String homeTeam = "Morocco";
        String awayTeam = "Algeria";
        scoreboard.startGame(new Game(new Team(homeTeam), new Team(awayTeam)));
        scoreboard.getSummary();
    }

    // getSummary NoGames test
    @Test
    public void getSummaryNoGames() {
        Scoreboard scoreboard = new Scoreboard();
        scoreboard.getSummary();
        assertTrue(scoreboard.games.size() == 0);
    }

    // finishGame Passed test
    @Test
    public void finishGamePassed() throws Exception {

        //Arrange
        Scoreboard scoreboard = new Scoreboard();
        String homeTeam = "Morocco";
        String awayTeam = "Algeria";
        // Act
        scoreboard.startGame(new Game(new Team(homeTeam), new Team(awayTeam)));

        //Assert
        assertTrue(scoreboard.games.size() == 1);

        //Act
        scoreboard.finishGame(new Game(new Team(homeTeam), new Team(awayTeam)));

        //Assert
        assertTrue(scoreboard.games.size() == 0);
    }


    // Finish game failed test
    @Test
    public void finishGameFail()  {
        //Arrange
        try {
            Scoreboard scoreboard = new Scoreboard();
            String homeTeam = "Morocco";
            String awayTeam = "Algeria";

            //Act
            scoreboard.finishGame(new Game(new Team(homeTeam), new Team(awayTeam)));
            fail("An exception was expected");

        } catch (Exception e) {
            //Assert
            assertTrue(true);
        }
    }

    // updateScore Pass Test
    @Test
    public void updateScorePass() throws Exception {
        //Arrange
        Scoreboard scoreboard = new Scoreboard();
        String homeTeam = "Morocco";
        String awayTeam = "Algeria";
        //Act
        scoreboard.startGame(new Game(new Team(homeTeam), new Team(awayTeam)));
        //Assert
        assertTrue(scoreboard.games.size() == 1);
        //Act
        scoreboard.updateScore(new Game(new Team(homeTeam), new Team(awayTeam), 6, 4));
        Game game = new Game(new Team(homeTeam), new Team(awayTeam));
        //Assert
        assertTrue(scoreboard.games.get(scoreboard .games.indexOf(game)).getTotalScore() == 10);
    }

    // updateScore Fail Test
    @Test
    public void updateScoreFail() throws Exception {
        try {
            Scoreboard scoreboard = new Scoreboard();
            String homeTeam = "Morocco";
            String awayTeam = "Algeria";

            scoreboard.updateScore(new Game(new Team(homeTeam), new Team(awayTeam), -3, 4));
            fail("An exception was expected");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

}
