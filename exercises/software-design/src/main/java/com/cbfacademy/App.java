package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        Game game = GameFactory.create();
        // Changed 'DiceGame' to Game variable type
        String winner = game.play();

        if (winner == null) {
            System.out.println("It's a draw!");
        } else {
            System.out.println(winner + " wins!");
        }
    }
}
