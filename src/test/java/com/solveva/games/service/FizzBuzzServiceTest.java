package com.solveva.games.service;

import com.solveva.games.domain.NumericGame;
import com.solveva.games.domain.fizzbuzz.FizzBuzz;
import com.solveva.games.domain.fizzbuzz.FizzBuzzGameResult;
import com.solveva.games.service.fizzbuzz.FizzBuzzService;
import com.solveva.games.service.fizzbuzz.FizzBuzzServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {FizzBuzzServiceTest.TestConfig.class})
class FizzBuzzServiceTest {

    @Autowired
    FizzBuzzService fizzBuzzService;

    @TestConfiguration
    public static class TestConfig {

        @Bean
        public FizzBuzzService getFizzBuzzService() {
            return new FizzBuzzServiceImpl();
        }

        @Bean
        public NumericGame getNumericGame(){
            return new FizzBuzz();
        }
    }

    @Test
    public void oneNumberTest() {
        List<FizzBuzzGameResult> result = fizzBuzzService.playGames(new int[]{1});
        Assertions.assertEquals(result.size(), 1);
    }

    @Test
    public void fewNumbersTest() {
        List<FizzBuzzGameResult> result = fizzBuzzService.playGames(new int[]{1, 2});
        Assertions.assertEquals(result.size(), 2);
    }
}
