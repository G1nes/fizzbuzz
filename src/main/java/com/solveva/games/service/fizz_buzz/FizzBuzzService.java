package com.solveva.games.service.fizz_buzz;

import com.solveva.games.domain.fizz_buzz.FizzBuzzGameResult;

import java.util.List;

public interface FizzBuzzService {

    List<FizzBuzzGameResult> playGames(int... numbers);
}
