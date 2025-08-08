package com.example;

public class Game {
    private Player player1;
    private Player player2;
    private int roundsPlayed = 0;
    private int draws = 0;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playRound() {
        roundsPlayed++;
        Choice choice1 = player1.makeChoice();
        Choice choice2 = player2.makeChoice();

        System.out.println("Round " + roundsPlayed + ":");
        System.out.println("Player 1 chooses: " + choice1);
        System.out.println("Player 2 chooses: " + choice2);

        if (choice1.getClass().equals(choice2.getClass())) {
            System.out.println("It's a draw!");
            draws++;
        } else if (choice1.winsAgainst(choice2)) {
            System.out.println("Player 1 wins!");
            player1.addWin();
        } else {
            System.out.println("Player 2 wins!");
            player2.addWin();
        }
    }

    public void printGameResults() {
        System.out.println("Game Over!");
        System.out.println("Rounds played: " + roundsPlayed);
        System.out.println("Draws: " + draws);
        System.out.println("Player 1 wins: " + player1.getWins());
        System.out.println("Player 2 wins: " + player2.getWins());
    }

    public boolean gameOver() {
        return player1.getWins() > 2 || player2.getWins() > 2;
    }

}
