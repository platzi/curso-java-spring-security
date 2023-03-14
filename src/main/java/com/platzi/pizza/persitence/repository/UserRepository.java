package com.platzi.pizza.persitence.repository;

import com.platzi.pizza.persitence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, String> {
}
