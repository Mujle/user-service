package com.example.userservice.controller;

import com.example.userservice.services.UserService;
import com.example.userservice.vo.UserVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    @ApiOperation(value = "Get a user by his username")
    public UserVO getUserByUsername(@PathVariable("username") String username){

        return userService.getUserByUsername(username);
    }
}
