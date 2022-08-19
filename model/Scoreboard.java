package model;

import java.util.ArrayList;
import java.util.List;

public class Scoreboard {

    // Games list
    public List<Game> games = new ArrayList<Game>();

    /*  1. Start a new game, assuming initial score 0 – 0 and adding it the scoreboard. This should capture following parameters:
             a. Home team
             b. Away team*/
    // Define startGame method after defining the startGameTest test (based TDD methodology)

    public void startGame(Game game) throws Exception {

        if(game.getHomeTeam().getTeamName().equals("") || game.getAwayTeam().getTeamName().equals("") ){
            throw new Exception(" Write a valid teams names, must not be empty");
        }else {
            games.add(0, new Game(game.getHomeTeam(), game.getAwayTeam()));
        }
    }

    // getSummary() defined - by TDD approach
    public void getSummary() {
        if (games == null || games.isEmpty()) {
            System.out.println("No games in progress, now");
        } else {
            games.stream().sorted().forEach(System.out::println);
        }
    }

    /* 2. Finish game currently in progress. This removes a match from the scoreboard.*/
    public void finishGame(Game game) throws Exception {
        if (games.contains(game)) {
            games.remove(game);
        } else {
            throw new Exception("Game " + game + " No game currently in progress.");
        }
    }
}
