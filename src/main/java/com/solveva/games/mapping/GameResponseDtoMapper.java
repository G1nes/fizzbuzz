package com.solveva.games.mapping;

import com.solveva.games.controller.fizzbuzz.FizzBuzzResponseDTO;
import com.solveva.games.domain.fizzbuzz.FizzBuzzGameResult;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GameResponseDtoMapper {

    public FizzBuzzResponseDTO map(List<FizzBuzzGameResult> gameResults) {
        FizzBuzzResponseDTO response = new FizzBuzzResponseDTO();
        List<FizzBuzzResponseDTO.FizzBuzzResultDTO> responseResults = new ArrayList<>();
        gameResults.forEach(gameResult -> responseResults.add(new FizzBuzzResponseDTO.FizzBuzzResultDTO(gameResult.getResult())));
        response.setGameResults(responseResults);
        return response;
    }
}
