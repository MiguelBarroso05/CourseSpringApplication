package com.MiguelBarroso.courseSpring.repositories;

import com.MiguelBarroso.courseSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
