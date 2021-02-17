package com.kevinjanvier.user.controller;

import com.kevinjanvier.user.VO.ResponseTemplateVO;
import com.kevinjanvier.user.entity.User;
import com.kevinjanvier.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(
            @PathVariable("id") Long id) {
        return userService.getUserWithDepartment(id);
    }
}
