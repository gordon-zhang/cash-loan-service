package cn.agency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.agency.domain.User;
import cn.agency.service.UserService;

/**
 * Created by gordon on 17/12/25.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping
    public ResponseEntity createUser(@RequestBody User user){
        userService.createUser(user);
        return ResponseEntity.ok().build();
    }
}
