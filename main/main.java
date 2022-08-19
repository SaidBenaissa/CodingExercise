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

        System.out.println("Start results");
        scoreboard.getSummary();
        System.out.println("-----------------------------------------------------------");
        System.out.println("Deleted one of games after it finshed");

        scoreboard.finishGame(new Game(new Team("Mexico"), new Team("Canada")));
        scoreboard.getSummary();

    }
}
