package com.gachon.splaship.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rankController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello controller";
    }
}