package net.persgroep.service.poc.micronaut;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringApplication {

    @Bean
    public HelloService brandService() {
        return new HelloService();
    }

}
