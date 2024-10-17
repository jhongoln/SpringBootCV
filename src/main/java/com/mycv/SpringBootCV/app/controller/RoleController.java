package com.mycv.SpringBootCV.app.controller;

import com.mycv.SpringBootCV.app.persistence.dtoAndMapper.RoleDto;
import com.mycv.SpringBootCV.app.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService service;

    @GetMapping("/listRoles")
    public ResponseEntity<List<RoleDto>> getRoles(){
        return ResponseEntity.ok(service.listRoles());
    }

}
