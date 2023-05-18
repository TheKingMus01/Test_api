package com.tester.test_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    /**
     * Retrieves a greeting message.
     *
     * @return the greeting message.
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
