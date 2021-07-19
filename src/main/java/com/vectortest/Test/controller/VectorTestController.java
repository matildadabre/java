package com.vectortest.Test.controller;

import com.vectortest.Test.Repo.UserRepo;
import com.vectortest.Test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VectorTestController {
    @Autowired
    private UserRepo userRepo;
    @GetMapping(value = "/")
    public String getPage(){
        return "Default Page";
    }
    @GetMapping(value = "/user")
    public List<User> getUsers(){
        return userRepo.findAll();
    }
    @PostMapping(value ="/user")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "The user was created successfully.";
    }

    @PutMapping(value = "user/{email}")
    public String updateUser(@PathVariable String email, @RequestBody User user){
        User updatedUser = userRepo.findByEmail(email);
        updatedUser.setFirstname(user.getFirstname());
        updatedUser.setLastname(user.getLastname());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setPassword(user.getPassword());
        userRepo.save(updatedUser);
        return "The user was updated successfully.";
    }

    @DeleteMapping(value = "user/{email}")
    public String deleteUser(@PathVariable String email){
        User deleteUser =userRepo.findByEmail(email);
        userRepo.delete(deleteUser);
        return "The user was deleted successfully";
    }


}
