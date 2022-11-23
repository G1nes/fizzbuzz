package com.solveva.games.service.fizzbuzz;

import com.solveva.games.domain.fizzbuzz.FizzBuzzGameResult;

import java.util.List;

public interface FizzBuzzService {

    List<FizzBuzzGameResult> playGames(int[] numbers);
}
