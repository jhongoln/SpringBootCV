package com.mycv.SpringBootCV.app.persistence.repository;

import com.mycv.SpringBootCV.app.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    Optional<UserEntity> findByUsername(String username);
 }
