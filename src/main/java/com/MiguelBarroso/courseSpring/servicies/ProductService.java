package com.MiguelBarroso.courseSpring.servicies;

import com.MiguelBarroso.courseSpring.entities.Product;
import com.MiguelBarroso.courseSpring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> productOptional = repository.findById(id);
        return productOptional.get();
    }
}
