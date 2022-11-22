package com.solveva.games.controller.fizz_buzz;

import org.apache.catalina.connector.ResponseFacade;

import javax.servlet.*;
import java.io.IOException;
import java.util.Arrays;

public class FizzBuzzFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        String[] numbers = request.getParameterMap().get("numbers");
        ResponseFacade responseFacade = (ResponseFacade) response;
        if (numbers.length > 0) {
            if (numbers[0].isEmpty() || isAnyNegativeNumbers(numbers)) {
                responseFacade.sendError(400);
            }
        }
        chain.doFilter(request, response);
    }

    private boolean isAnyNegativeNumbers(String[] numbers){
        return Arrays.stream(numbers)
                .anyMatch(number -> number.contains("-"));
    }
}
