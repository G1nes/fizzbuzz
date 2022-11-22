package com.solveva.games.service.fizz_buzz;

import com.solveva.games.domain.Game;
import com.solveva.games.domain.GameFactory;
import com.solveva.games.domain.fizz_buzz.FizzBuzz;
import com.solveva.games.domain.fizz_buzz.FizzBuzzGameResult;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FizzBuzzServiceImpl implements FizzBuzzService {

    @Override
    public List<FizzBuzzGameResult> playGames(int... numbers) {
        List<FizzBuzzGameResult> results = new ArrayList<>();
        Arrays.stream(numbers)
                .forEach(number -> {
                    Game game = GameFactory.createGame(FizzBuzz.class);
                    ((FizzBuzz)game).setNumber(number);
                    results.add(game.play());
                });
        return results;
    }
}
