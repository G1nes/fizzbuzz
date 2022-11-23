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
            if (i % 15 == 0) {
                result.add("Fizz Buzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        gameResult.setResult(result);
        return gameResult;
    }
}
