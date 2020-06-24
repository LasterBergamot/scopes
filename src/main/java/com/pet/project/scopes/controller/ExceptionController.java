package com.pet.project.scopes.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionController.class);

    @GetMapping("/exceptions/npe")
    public void getNPE() {
        throw new NullPointerException("NPE thrown from ExceptionController!");
    }

    @GetMapping("/exceptions/iae")
    public void getIAE() {
        throw new IllegalArgumentException("IllegalArgumentException thrown from ExceptionController!");
    }

    @GetMapping("/exceptions/ise")
    public void getISE() {
        throw new IllegalStateException("IllegalStateException thrown from ExceptionController!");
    }
}
