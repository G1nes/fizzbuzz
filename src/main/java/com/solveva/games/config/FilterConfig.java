package com.solveva.games.config;

import com.solveva.games.controller.fizz_buzz.FizzBuzzFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<FizzBuzzFilter> filterRegistrationBean() {
        FilterRegistrationBean<FizzBuzzFilter> registrationBean = new FilterRegistrationBean<>();
        FizzBuzzFilter fizzBuzzFilter = new FizzBuzzFilter();
        registrationBean.setFilter(fizzBuzzFilter);
        registrationBean.addUrlPatterns("/fizzbuzz/*");
        return registrationBean;
    }
}
