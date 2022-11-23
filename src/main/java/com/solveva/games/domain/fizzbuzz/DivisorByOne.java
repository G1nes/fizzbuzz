package com.solveva.games.domain.fizzbuzz;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DivisorByOne implements FizzBuzzNumber {

    private final int number;

    @Override
    public String print() {
        return String.valueOf(number);
    }
}
