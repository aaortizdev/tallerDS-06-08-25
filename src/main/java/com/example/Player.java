package com.example;

public class Player {

    private int wins = 0;

    public Choice makeChoice() {
        return Choice.randomChoice();
    }

    public void addWin() {
        wins++;
    }

    public int getWins() {
        return wins;
    }

    
}
