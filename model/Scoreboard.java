package model;

import java.util.ArrayList;
import java.util.List;

public class Scoreboard {

    // Games list
    public List<Game> games = new ArrayList<Game>();

    // Define startGame method after defining the startGameTest test (based TDD methodology)
    public void startGame(Game game) throws Exception {

        if(game.getHomeTeam().getTeamName().equals("") || game.getAwayTeam().getTeamName().equals("") ){
            throw new Exception(" Write a valid team names, must not be empty");
        }else {
            games.add(0, new Game(game.getHomeTeam(), game.getAwayTeam()));
        }
    }
}
