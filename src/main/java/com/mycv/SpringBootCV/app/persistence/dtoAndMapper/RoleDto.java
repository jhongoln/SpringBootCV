package com.mycv.SpringBootCV.app.persistence.dtoAndMapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoleDto {

    private Long id;

    private String role;

    private LocalDateTime createdAt;

    private LocalDateTime dateModified;

}
