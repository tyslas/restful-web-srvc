package com.tito.restfulwebsrvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    private String message;

    public ServiceController(@Value("${welcome.message}") String welcomeMessage) {
        this.message = welcomeMessage;
    }

    @GetMapping("/")
    public String sayHello() {
        return message;
    }
}
