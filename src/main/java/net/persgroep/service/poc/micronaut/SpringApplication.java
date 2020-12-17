package net.persgroep.service.poc.micronaut;

import io.micronaut.core.cli.CommandLine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringApplication {

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }

    // Prevents an error with micronaut-spring on AWS Lambda
    // Do not delete this, unless you know what you're doing :)
    @Bean
    public CommandLine commandLine() {
        return new FakeCommandLine();
    }
}
