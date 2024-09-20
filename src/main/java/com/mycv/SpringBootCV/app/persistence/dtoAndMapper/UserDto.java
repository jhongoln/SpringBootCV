package com.mycv.SpringBootCV.app.persistence.dtoAndMapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {

    private String username;

    private String password;

    private String email;

    private Boolean locked;

    private Boolean disabled;

    private LocalDateTime createdAt;

    private LocalDateTime dateModified;

    private List<RoleDto> roleDto;
}
