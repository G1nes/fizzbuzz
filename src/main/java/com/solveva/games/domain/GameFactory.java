package com.solveva.games.domain;

import com.solveva.games.domain.fizz_buzz.FizzBuzz;

public class GameFactory {

    private GameFactory() {
        throw new UnsupportedOperationException("You don't need to create instance of " + this.getClass().getName());
    }

    public static Game createGame(Class<? extends Game> gameClass) {
        if (gameClass.equals(FizzBuzz.class)) {
            return new FizzBuzz(0);
        }
        throw new IllegalArgumentException("No games implemented with type " + gameClass.getName());
    }
}
