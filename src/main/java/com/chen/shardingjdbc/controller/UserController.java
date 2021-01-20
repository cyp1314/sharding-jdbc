package com.chen.shardingjdbc.controller;

import com.chen.shardingjdbc.entity.User;
import com.chen.shardingjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Mr-CHEN
 * @version 1.0
 * @description: TODO
 * @date 2021-01-20 10:51
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> selectAll(){
        List<User> list = userService.list();
        return list;
    }

    @PostMapping("/save")
    public boolean saveUser(@RequestBody User user){
        boolean result = userService.save(user);
        return result;
    }
}
