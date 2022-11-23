package com.solveva.games.domain.fizzbuzz;

public class FizzBuzzBadNumberException extends RuntimeException{
    private static final String NUMBER_SMALLER_OR_EQUAL_ZERO = "Number should be bigger than 0";

    public FizzBuzzBadNumberException() {
        super(NUMBER_SMALLER_OR_EQUAL_ZERO);
    }
}
