package com.pet.project.scopes.controller;

import com.pet.project.scopes.service.IRandomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RandomController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RandomController.class);

    private IRandomService randomService;

    @Autowired
    public RandomController(IRandomService randomService) {
        this.randomService = randomService;
    }

    @GetMapping("/profiles/random")
    public String getRandomNumber() {

        LOGGER.info("Random number [1, 10]: {}", randomService.getRandomNumber(1, 10));

        return "index";
    }
}
