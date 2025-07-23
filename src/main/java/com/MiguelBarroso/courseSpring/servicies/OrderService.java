package com.MiguelBarroso.courseSpring.servicies;

import com.MiguelBarroso.courseSpring.entities.Order;
import com.MiguelBarroso.courseSpring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> orderOptional = repository.findById(id);
        return orderOptional.get();
    }
}
