package com.abc.rest;

import com.abc.models.User;
import com.abc.services.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class UsermanagerRest {

    @Autowired
    UserManagerService userManagerService;

    @GetMapping("/")
    public String getHome(){
        return "Home OF ABC Online Store";
    }

    @GetMapping("users/all")
    public Map<String, User> getAllUsers(){
        return userManagerService.findAllUsers();
    }

    @GetMapping("/users/id/{userId}")
    public User getUserById(@PathVariable String userId){
        return userManagerService.findUserById(userId);
    }

    @PostMapping("/users/add/")
    public User addUser(@RequestBody User user){
        return userManagerService.addUser(user);
    }

    @PutMapping("/users/update/")
    public User updateUser(@RequestBody User user){
        return userManagerService.updateUser(user);
    }


    @DeleteMapping("/users/delete/{userId}")
    public boolean deleteUser(@PathVariable String userId){
        return userManagerService.deleteUser(userId);
    }
}
