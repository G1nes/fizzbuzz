package com.solveva.games.controller.fizz_buzz;

import com.solveva.games.mapping.GameResponseDtoMapper;
import com.solveva.games.service.fizz_buzz.FizzBuzzService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/fizzbuzz")
@RestController
@AllArgsConstructor
public class FizzBuzzController {

    private final FizzBuzzService fizzBuzzService;
    private final GameResponseDtoMapper mapper;

    @GetMapping("/play")
    public FizzBuzzResponseDTO getNumbersByInput(@RequestParam int[] numbers) {
        return mapper.map(fizzBuzzService.playGames(numbers));
    }
}
