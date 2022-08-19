package test;

// Based on TDD we need to start by methods tests first
public class Test {
    @Test
    public void startGamePassed() throws Exception {
        //Arrange
        Scoreboard scoreboard = new Scoreboard();
        String homeTeam = "Morocco";
        String awayTeam = "Algeria";
        //Act
        scoreboard.startGame(new Game(new Team(homeTeam), new Team(awayTeam)));

        //Assert
        assertTrue(scoreboard.games.size() == 1);
    }

}
