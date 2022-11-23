package com.solveva.games.domain.fizzbuzz.numbers;

public class FizzBuzzNumberFactory {

    public static FizzBuzzNumber createFizzBuzzNumber(int number) {
        if (number % 15 == 0) {
            return new DivisorByFifteen();
        } else if (number % 3 == 0) {
            return new DivisorByThree();
        } else if (number % 5 == 0) {
            return new DivisorByFive();
        } else {
            return new DivisorByOne(number);
        }
    }
}
