package com.parser.parser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gibcen")
public class Newcontroller {

    @GetMapping("/")
    public String hello() {
        return "hai";
    }
}
