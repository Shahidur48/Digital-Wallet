package com.optimagrowth.user.controller;

import com.optimagrowth.user.model.User;
import com.optimagrowth.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/users",                      // <1>
        produces="application/json")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(consumes="application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public User postPerson(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public User userById(@PathVariable("id") Long id) {
        return userService.userById(id);
    }
//    @GetMapping("verifyUser/{id}")
//    public Boolean IsUser(@PathVariable("id") Long id) {
//        return userService.IsUser(id);
//    }
}
