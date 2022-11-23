package com.solveva.games.controller.fizzbuzz;

import com.solveva.games.mapping.GameResponseDtoMapper;
import com.solveva.games.service.fizzbuzz.FizzBuzzService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/fizzbuzz")
@RestController
@AllArgsConstructor
public class FizzBuzzController {

    private final FizzBuzzService fizzBuzzService;
    private final GameResponseDtoMapper mapper;

    @PostMapping("/play")
    public FizzBuzzResponseDTO getNumbersByInput(@RequestBody int[] numbers) {
        return mapper.map(fizzBuzzService.playGames(numbers));
    }
}
