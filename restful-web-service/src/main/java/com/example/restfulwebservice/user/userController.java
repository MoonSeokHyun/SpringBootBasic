package com.example.restfulwebservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userController {
    @Autowired
    private UserDAOService service;

    @GetMapping("/users")
    public List<User> retrieveAllusers(){
        return service.findAll();
    }

    // Get / users/1 or users/2 <- 가변변수에 포함
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        return service.findOne(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        User savedUser = service.save(user);
    }

}
