package com.mycv.SpringBootCV.app.persistence.dtoAndMapper;

import com.mycv.SpringBootCV.app.persistence.entity.UserEntity;
import com.mycv.SpringBootCV.app.persistence.entity.RoleEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMapper {


    public UserDto mapperUserDto(UserEntity userEntity){
        UserDto dto = new UserDto();
        dto.setUsername(userEntity.getUsername());
        dto.setPassword(userEntity.getPassword());
        dto.setEmail(userEntity.getEmail());
        dto.setDisabled(userEntity.getDisabled());
        dto.setLocked(userEntity.getLocked());
        dto.setCreatedAt(userEntity.getCreatedAt());
        dto.setDateModified(userEntity.getDateModified());
        dto.setRoleDto(listRolDto(userEntity.getRoles()));
        return dto;
    }


    public UserEntity mapperUserEntity(UserDto userDto){
        UserEntity entity = new UserEntity();
        entity.setUsername(userDto.getUsername());
        entity.setPassword(userDto.getPassword());
        entity.setEmail(userDto.getEmail());
        entity.setDisabled(userDto.getDisabled());
        entity.setLocked(userDto.getLocked());
        entity.setCreatedAt(userDto.getCreatedAt());
        entity.setDateModified(userDto.getDateModified());
        entity.setRoles(listRolEnt(userDto.getRoleDto()));
        return entity;
    }

    public List<RoleDto> listRolDto(List<RoleEntity> roles){
        List<RoleDto> list = new ArrayList<>();

        for(RoleEntity rol: roles) {
            RoleDto roleDto = new RoleDto();
            roleDto.setId(rol.getId());
            roleDto.setRole(rol.getRole());
            roleDto.setCreatedAt(rol.getCreatedAt());
            roleDto.setDateModified(rol.getDateModified());
            list.add(roleDto);
        }
        return list;
    }

    public List<RoleEntity> listRolEnt(List<RoleDto> roles){
        List<RoleEntity> list = new ArrayList<>();

        for(RoleDto rol: roles) {
            RoleEntity roleDto = new RoleEntity();
            roleDto.setId(rol.getId());
            roleDto.setRole(rol.getRole());
            roleDto.setCreatedAt(rol.getCreatedAt());
            roleDto.setDateModified(rol.getDateModified());
            list.add(roleDto);
        }
        return list;
    }



}
