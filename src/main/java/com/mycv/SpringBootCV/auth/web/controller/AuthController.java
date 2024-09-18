package com.mycv.SpringBootCV.auth.web.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {


    @PostMapping("login")
    public ResponseEntity<String> login( ){
        return ResponseEntity.ok("prueba exitosa");

    }

}
