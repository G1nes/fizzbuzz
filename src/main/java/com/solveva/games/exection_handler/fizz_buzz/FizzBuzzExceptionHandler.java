package com.solveva.games.exection_handler.fizz_buzz;

import com.solveva.games.domain.fizz_buzz.FizzBuzzBadNumberException;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class FizzBuzzExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = {FizzBuzzBadNumberException.class})
    protected ResponseEntity<Object> handleNoUsersException(RuntimeException ex,
                                                            WebRequest request) {
        return handleExceptionInternal(
                ex,
                ex.getMessage(),
                new HttpHeaders(),
                HttpStatus.INTERNAL_SERVER_ERROR,
                request);
    }
}
