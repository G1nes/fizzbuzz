package com.solveva.games.controller.fizz_buzz;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class FizzBuzzResponseDTO {

    private List<FizzBuzzResultDTO> gameResults;

    @Data
    @AllArgsConstructor
    public static class FizzBuzzResultDTO {
        private List<String> result;
    }
}
