package com.solveva.games.domain.fizzbuzz.numbers;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DivisorByOne implements FizzBuzzNumber {

    private final int number;

    @Override
    public String printNumber() {
        return String.valueOf(number);
    }
}
