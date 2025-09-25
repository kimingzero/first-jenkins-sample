package dev.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/goodbye")
public class GoodByeController {

    @GetMapping
    public String hello() {
        return "Goodbye Jenkins!!";
    }
}
