package com.muates.springbootbilgeadamsecurity.controller;

import com.muates.springbootbilgeadamsecurity.model.dto.UserAddRequest;
import com.muates.springbootbilgeadamsecurity.model.entity.User;
import com.muates.springbootbilgeadamsecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody UserAddRequest request) {
        return userService.addUser(request);
    }
}
