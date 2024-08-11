package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        Player player1 = PlayerFactory.create();// Ex3 change
        Player player2 = PlayerFactory.create();// Ex3 change
        Game game = new DiceGame(player1,player2); // Ex3 change
        // Changed 'DiceGame' to Game variable type
        String winner = game.play();

        if (winner == null) {
            System.out.println("It's a draw!");
        } else {
            System.out.println(winner + " wins!");
        }
    }
}
