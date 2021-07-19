package com.vectortest.Test.controller;

import com.vectortest.Test.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VectorTestController {
    @Autowired
    private UserRepo userRepo;
    @GetMapping(value = "/")
    public String getPage(){
        return "Default Page";
    }



}
