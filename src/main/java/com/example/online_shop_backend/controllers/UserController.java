package com.example.online_shop_backend.controllers;

import com.example.online_shop_backend.entites.Users;
import com.example.online_shop_backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

@RestController
public class UserController {
    public UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<Users> getUserList(){
        return userService.getUserList();
    }

    @PostMapping("/user") // Corrected URL mapping
    public Users addUser(@RequestBody Users user){
        return userService.addUser(user);
    }


}
