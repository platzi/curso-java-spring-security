package com.platzi.pizza.persitence.repository;

import com.platzi.pizza.persitence.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {
}
