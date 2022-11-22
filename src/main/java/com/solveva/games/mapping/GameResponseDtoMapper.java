package com.solveva.games.mapping;

import com.solveva.games.controller.fizz_buzz.FizzBuzzResponseDTO;
import com.solveva.games.domain.fizz_buzz.FizzBuzzGameResult;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GameResponseDtoMapper {

    public FizzBuzzResponseDTO map(List<FizzBuzzGameResult> results) {
        FizzBuzzResponseDTO gameResponse = new FizzBuzzResponseDTO();
        List<FizzBuzzResponseDTO.FizzBuzzResultDTO> gameResults = new ArrayList<>();
        results.forEach(gameResult -> gameResults.add(new FizzBuzzResponseDTO.FizzBuzzResultDTO(gameResult.getResult())));
        gameResponse.setGameResults(gameResults);
        return gameResponse;
    }
}
