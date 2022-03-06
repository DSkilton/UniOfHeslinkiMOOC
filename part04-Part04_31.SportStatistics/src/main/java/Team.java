/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duncan
 */
public class Team {
    private String homeTeam, awayTeam;
    private int homeScore, awayScore, games, wins, losses;
    
    public Team(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getAwayTeam(){
        return this.awayTeam;
    }
    
    public int getHomeScore () {
        return this.homeScore;
    }
    
    public int getAwayScore(){
        return this.awayScore;
    }
    
    public int playGame() {
        return this.games += 1;
    }
    
    public int setWins(){
        return this.wins += 1;
    }
    
    public int setLosses() {
        return this.losses += 1;
    }
    
    public int getWins() {
        return this.wins;
    }
    
    public int getLosses() {
        return this.losses;
    }
}
