package com.mahesh.ldapsecurity.controller;


/*
Author: Mahesh Punugupati
*/

import com.mahesh.ldapsecurity.dto.UserDto;
import com.mahesh.ldapsecurity.entity.UserEntity;
import com.mahesh.ldapsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String hello(){
        return "Welcome come to APP";
    }

    @GetMapping("/create")
    public UserDto save(@RequestParam("userName") String userName, @RequestParam("userDescription") String userDescription){

        return userService.saveUser(new UserDto(0, userName,userDescription));
    }

    @DeleteMapping("/delete/{userId}")
    public UserDto delete(@PathVariable("userId") UserDto userDto){
        return userService.saveUser(userDto);
    }

    @PutMapping("/update")
    public UserDto update(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }

    @GetMapping("/get")
    public List<UserEntity> get(){
        return userService.getUsers();
    }

}
