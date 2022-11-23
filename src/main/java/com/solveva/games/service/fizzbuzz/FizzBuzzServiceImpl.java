package com.solveva.games.service.fizzbuzz;

import com.solveva.games.domain.NumericGame;
import com.solveva.games.domain.fizzbuzz.FizzBuzzGameResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class FizzBuzzServiceImpl implements FizzBuzzService {

    private final NumericGame game;

    @Override
    public List<FizzBuzzGameResult> playGames(int[] numbers) {
        List<FizzBuzzGameResult> results = new ArrayList<>();
        Arrays.stream(numbers)
                .forEach(number -> results.add(game.play(number)));
        return results;
    }
}
