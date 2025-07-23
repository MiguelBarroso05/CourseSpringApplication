package com.MiguelBarroso.courseSpring.repositories;

import com.MiguelBarroso.courseSpring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
