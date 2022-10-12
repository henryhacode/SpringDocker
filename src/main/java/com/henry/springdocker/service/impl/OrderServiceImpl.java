package com.henry.springdocker.service.impl;

import com.henry.springdocker.entity.ShoppingOrder;
import com.henry.springdocker.repository.OrderRepository;
import com.henry.springdocker.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;


    @Override
    public List<ShoppingOrder> findAll() {
        return (List<ShoppingOrder>) orderRepository.findAll();
    }

    @Override
    public List<ShoppingOrder> findByCustomerId(Long customerId) {
        return orderRepository.findOrdersByCustomerId(customerId);
    }

    @Override
    public ShoppingOrder findById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ShoppingOrder shoppingOrder) {
        orderRepository.save(shoppingOrder);
    }

    @Override
    public ShoppingOrder delete(Long id) {
        ShoppingOrder shoppingOrder = orderRepository.findById(id).orElse(null);
        orderRepository.deleteById(id);
        return shoppingOrder;
    }
}
