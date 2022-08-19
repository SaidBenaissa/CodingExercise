package main;

import model.Game;
import model.Scoreboard;
import model.Team;

public class main {
    public static void main(String[] args) throws Exception {
        Scoreboard scoreboard = new Scoreboard();

        System.out.println("--------------------------------------------------------------------");
        scoreboard.startGame(new Game(new Team("Mexico"),new Team("Canada")));
        scoreboard.startGame(new Game(new Team("Spain"),new Team("Brazil")));
        scoreboard.startGame(new Game(new Team("Germany"),new Team("France")));
        scoreboard.startGame(new Game(new Team("Uruguay"),new Team("Italy")));
        scoreboard.startGame(new Game(new Team("Argentine"),new Team("Australia")));
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Results");
        scoreboard.getSummary();

/*        System.out.println("-----------------------------------------------------------");
        System.out.println("Deleted one game finshed");
        scoreboard.finishGame(new Game(new Team("Mexico"), new Team("Canada")));
        scoreboard.getSummary();*/

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Games in progress - update score");

        scoreboard.updateScore(new Game(new Team("Mexico"),new Team("Canada"),0,5));
        scoreboard.updateScore(new Game(new Team("Spain"),new Team("Brazil"),10,2));
        scoreboard.updateScore(new Game(new Team("Germany"),new Team("France"),2,2));
        scoreboard.updateScore(new Game(new Team("Uruguay"),new Team("Italy"),6,6));
        scoreboard.updateScore(new Game(new Team("Argentine"),new Team("Australia"),3,1));
        scoreboard.getSummary();
        System.out.println("-----------------------------------------------------------");

        scoreboard.finishGame(new Game(new Team("Mexico"), new Team("Canada")));
        scoreboard.getSummary();

    }
}
