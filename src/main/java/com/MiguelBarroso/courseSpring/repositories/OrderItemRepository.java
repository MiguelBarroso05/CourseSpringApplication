package com.MiguelBarroso.courseSpring.repositories;

import com.MiguelBarroso.courseSpring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
