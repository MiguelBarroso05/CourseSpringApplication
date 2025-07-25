package com.MiguelBarroso.courseSpring.repositories;

import com.MiguelBarroso.courseSpring.entities.OrderItem;
import com.MiguelBarroso.courseSpring.entities.pk.OrderItemPK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
