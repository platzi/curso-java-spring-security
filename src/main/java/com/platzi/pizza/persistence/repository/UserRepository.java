package com.platzi.pizza.persistence.repository;

import com.platzi.pizza.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, String> {
}
