package com.cbfacademy;

public class PlayerFactory {
    /**
     * Creates a new player.
     *
     * @return A new player.
     */
    public static Player create() { // Previously had 'DicePlayer return type' 
        // Not seen a class included 'DicePlayer' 
        return new DicePlayer(); // Can not make instances of a interface, that's why we return 'DicePlayer' which is a concrete class
    }
}
