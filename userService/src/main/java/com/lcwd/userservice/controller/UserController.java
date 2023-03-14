package com.lcwd.userservice.controller;

import java.util.List;

import com.lcwd.userservice.entity.User;
import com.lcwd.userservice.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    //Create new api for creating new user
    @PostMapping("/test")
    public ResponseEntity<User> addUser(@RequestBody User user)
    {
        System.out.println(user);
        User newUser = userService.saveUser(user);
        return  ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }

    @GetMapping("/getUser/{id}")
    public  ResponseEntity<User>  getSingleUser(@PathVariable String id)
    {
        User user1 = userService.getUserById(id);
        return ResponseEntity.ok(user1);
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers()
    {
        List<User> users = userService.getAlllUser();
        return ResponseEntity.ok(users);
    }


}