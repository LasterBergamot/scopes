package com.pet.project.scopes.service.impl;

import com.pet.project.scopes.service.IRandomService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
@Profile("double")
public class DoubleRandomService implements IRandomService {

    @Override
    public Double getRandomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextDouble(min, max + 1.0);
    }
}
