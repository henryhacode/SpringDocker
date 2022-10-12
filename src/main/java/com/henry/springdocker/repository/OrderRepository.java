package com.henry.springdocker.repository;

import com.henry.springdocker.entity.ShoppingOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<ShoppingOrder, Long> {
    List<ShoppingOrder> findOrdersByCustomerId(Long customerId);
}
