package com.vectortest.Test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VectorTestController {

    @GetMapping(value = "/")
    public String getPage(){
        return "Default Page";
    }
}
