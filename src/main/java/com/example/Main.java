package com.example;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Game game = new Game(player1, player2);

        while (!game.gameOver()) {
            game.playRound();
        }

        game.printGameResults();

    }
}