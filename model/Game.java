package model;

public class Game implements Comparable<Object> {
    private Team homeTeam;
    private Team awayTeam;
    private int awayScore;
    private int homeScore;

    public Integer getTotalScore() {
        return awayScore + homeScore;
    }


    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }


    public Game(Team homeTeam, Team awayTeam, int homeScore, int awayScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public String toString() {
        return homeTeam.getTeamName() + " " + homeScore + " - " + awayTeam.getTeamName() + " " + awayScore;
    }

    public int compareTo(Object o) {
        Game other = (Game) o;
        return other.getTotalScore().compareTo(getTotalScore());
    }


    //Two games are equal if they have the same teams names
    @Override
    public boolean equals(Object o) {
        Game other = (Game) o;
        return homeTeam.getTeamName().equals(other.homeTeam.getTeamName())
                && awayTeam.getTeamName().equals(other.awayTeam.getTeamName());
    }
}
