package com.solveva.games.domain;

import com.solveva.games.domain.fizzbuzz.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FizzBuzzTest {

    private final NumericGame numericGame = new FizzBuzz();

    @Test
    public void checkNegativeNumber() {
        Assertions.assertThrows(FizzBuzzBadNumberException.class, () -> numericGame.play(-1));
    }

    @Test
    public void checkPositiveNumber() {
        FizzBuzzGameResult mockedResult = new FizzBuzzGameResult();
        mockedResult.setResult(List.of("1", "2", "Fizz", "4", "Buzz"));
        Assertions.assertEquals(mockedResult, numericGame.play(5));
    }
}
