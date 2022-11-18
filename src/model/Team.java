/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author andre
 */
public class Team {
    private int uuid;
    private String name;
    private int gamesPlayed;
    private int wins;
    private int losses;
    private int draws;
    private int goalsScored;
    private int goalsConceded;

    public Team() {
    }

    public Team(int uuid, String name, int gamesPlayed, int wins, int losses, int draws, int goalsScored, int goalsConceded) {
        this.uuid = uuid;
        this.name = name;
        this.gamesPlayed = gamesPlayed;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
        this.goalsScored = goalsScored;
        this.goalsConceded = goalsConceded;
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }
    
}
