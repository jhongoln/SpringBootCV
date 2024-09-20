package com.mycv.SpringBootCV.app.persistence.repository;

import com.mycv.SpringBootCV.app.persistence.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<RoleEntity, Long> {
}
