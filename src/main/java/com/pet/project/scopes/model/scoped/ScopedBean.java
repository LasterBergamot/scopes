package com.pet.project.scopes.model.scoped;

import com.pet.project.scopes.model.hello.HelloMessageGenerator;

public abstract class ScopedBean {

    private HelloMessageGenerator helloMessageGenerator = new HelloMessageGenerator();

    public HelloMessageGenerator getHelloMessageGenerator() {
        return helloMessageGenerator;
    }

    public void setHelloMessageGenerator(HelloMessageGenerator helloMessageGenerator) {
        this.helloMessageGenerator = helloMessageGenerator;
    }

}
