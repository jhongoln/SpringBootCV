package com.mycv.SpringBootCV.app.service;

import com.mycv.SpringBootCV.app.persistence.dtoAndMapper.UserDto;
import com.mycv.SpringBootCV.app.persistence.dtoAndMapper.UserMapper;
import com.mycv.SpringBootCV.app.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final PasswordEncoder passwordEncoder;

    private final UserMapper mapper;

    private final UserRepository repository;

    @Autowired
    public UserService(PasswordEncoder passwordEncoder, UserMapper mapper, UserRepository repository) {
        this.passwordEncoder = passwordEncoder;
        this.mapper = mapper;
        this.repository = repository;
    }

    public void saveUser(UserDto userDto){
        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        repository.save(mapper.mapperUserEntity(userDto));
    }


}
