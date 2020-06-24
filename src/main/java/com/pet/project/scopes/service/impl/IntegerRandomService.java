package com.pet.project.scopes.service.impl;

import com.pet.project.scopes.service.IRandomService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
@Profile("integer")
public class IntegerRandomService implements IRandomService {

    @Override
    public Integer getRandomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
