package com.apirest.controllers;

import com.apirest.models.User;
import com.apirest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {


    @Autowired
    UserService userService;


    @GetMapping()
    List<User> getAllUser(){
        return  userService.getAllUser();
    }

    @GetMapping("/{id}")
    User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }


    @PostMapping()
    User crearUser(@RequestBody User user){

        return userService.crearUser(user);
    }

    @PutMapping("/{id}")
    User actualizarUser(@RequestBody User user,@PathVariable Long id){

        return userService.actualizarUser(user, id);
    }

    @DeleteMapping ("/{id}")
    void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);

    }
}

