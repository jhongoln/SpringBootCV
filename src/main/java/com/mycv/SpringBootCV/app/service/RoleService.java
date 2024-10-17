package com.mycv.SpringBootCV.app.service;

import com.mycv.SpringBootCV.app.persistence.dtoAndMapper.RoleDto;
import com.mycv.SpringBootCV.app.persistence.dtoAndMapper.UserRoleMapper;
import com.mycv.SpringBootCV.app.persistence.entity.RoleEntity;
import com.mycv.SpringBootCV.app.persistence.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    private final UserRoleMapper mapper;

    private final RoleRepository repository;

    public RoleService(UserRoleMapper mapper, RoleRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public List<RoleDto> listRoles(){
        List<RoleEntity> list = (List<RoleEntity>) repository.findAll();
        return mapper.listRolDto(list);
    }
}
