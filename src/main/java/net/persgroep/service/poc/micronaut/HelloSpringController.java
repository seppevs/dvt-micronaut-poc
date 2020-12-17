package net.persgroep.service.poc.micronaut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloSpringController {

    private final HelloService helloService;

    @Autowired
    public HelloSpringController(final HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/greetings")
    public List<String> getGreetings() {
        return helloService.getGreetings();
    }
}
