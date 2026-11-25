package com.jsp.ecomApp.controller;

import com.jsp.ecomApp.Service.UserService;
import com.jsp.ecomApp.dao.UserRepository;
import com.jsp.ecomApp.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/shopApp")
public class UserController {

    private final UserService userService;
    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).
                body(userService.createUser(user));
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password){
        return ResponseEntity.status(HttpStatus.OK).body(userService.login(email,password));
    }
    @PutMapping("/changePassword")
    public ResponseEntity<String> updatePassword(@RequestParam String email,
                                                 @RequestParam String newPassword,@RequestParam String oldPassword){
        return ResponseEntity.status(HttpStatus.OK).body((userService.updatePassword(email,newPassword,oldPassword)));
    }
}
