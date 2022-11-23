package com.solveva.games.domain.fizzbuzz;

import com.solveva.games.domain.NumericGame;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FizzBuzz implements NumericGame {

    @Override
    public FizzBuzzGameResult play(int number) {
        if (number <= 0) {
            throw new FizzBuzzBadNumberException();
        }
        FizzBuzzGameResult gameResult = new FizzBuzzGameResult();
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= number; ++i) {
            result.add(FizzBuzzNumberFactory.createFizzBuzzNumber(i).print());
        }
        gameResult.setResult(result);
        return gameResult;
    }
}
