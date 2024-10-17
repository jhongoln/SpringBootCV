package com.mycv.SpringBootCV.app.controller;

import com.mycv.SpringBootCV.app.persistence.dtoAndMapper.UserDto;
import com.mycv.SpringBootCV.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/listUsers")
    public ResponseEntity<List<UserDto>> getUsers( ){
        return ResponseEntity.ok(service.listUsers());
    }
}
