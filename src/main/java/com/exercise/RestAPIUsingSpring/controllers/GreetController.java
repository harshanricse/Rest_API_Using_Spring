package com.exercise.RestAPIUsingSpring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Locale;

/*
CookPick is an online application that helps its customers purchase grocery items at best price in the market.

Write a REST method for this application that should capture the current day and return a welcome String that includes the current day (example - "Welcome to Wednesday sale").

Write a RESTful method called greet().

 REST URL

HTTP Action	Business Operation
/greet	GET	greet()
Method description as follows:

public String greet()

This method,

handles GET requests
captures the current day
returns a welcome String with current day
 */
@RestController
public class GreetController {
    @RequestMapping("/greet")
    @GetMapping
    public String greet(){
        LocalDate date = LocalDate.now();
        return "Welcome to "+date.getDayOfWeek()+" sale";
    }
}
