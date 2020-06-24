package com.pet.project.scopes.controller;

import com.pet.project.scopes.service.IRandomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RandomController {

    private IRandomService randomService;

    @Autowired
    public RandomController(IRandomService randomService) {
        this.randomService = randomService;
    }

    @GetMapping("/profiles/random")
    public String getRandomNumber() {

        System.out.println("Random number [1, 10]: " + randomService.getRandomNumber(1, 10));

        return "index";
    }
}
