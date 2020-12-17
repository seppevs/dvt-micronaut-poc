package net.persgroep.service.poc.micronaut;

import java.util.Arrays;
import java.util.List;

public class HelloService {

    public List<String> getGreetings() {
        return Arrays.asList("hello", "goeiedag", "gegroet");
    }

}
