package net.persgroep.service.poc.micronaut;

import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}


// See https://guides.micronaut.io/mn-application-aws-lambda-java11/guide/index.html
