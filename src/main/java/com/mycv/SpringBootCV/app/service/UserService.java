package com.mycv.SpringBootCV.app.service;

import com.mycv.SpringBootCV.app.persistence.dtoAndMapper.UserDto;
import com.mycv.SpringBootCV.app.persistence.dtoAndMapper.UserRoleMapper;
import com.mycv.SpringBootCV.app.persistence.entity.UserEntity;
import com.mycv.SpringBootCV.app.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final PasswordEncoder passwordEncoder;

    private final UserRoleMapper mapper;

    private final UserRepository repository;

    @Autowired
    public UserService(PasswordEncoder passwordEncoder, UserRoleMapper mapper, UserRepository repository) {
        this.passwordEncoder = passwordEncoder;
        this.mapper = mapper;
        this.repository = repository;
    }

    public void saveUser(UserDto userDto){
        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        repository.save(mapper.mapperUserEntity(userDto));
    }

    public List<UserDto> listUsers(){
        List<UserEntity> list = (List<UserEntity>) repository.findAll();
        return mapper.allUsersDto(list);
    }


}
