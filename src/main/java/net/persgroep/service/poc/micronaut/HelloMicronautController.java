package net.persgroep.service.poc.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello-micronaut")
public class HelloMicronautController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        return "Hello from the Micronaut Controller!";
    }

}
