package com.MiguelBarroso.courseSpring.servicies;

import com.MiguelBarroso.courseSpring.entities.Category;
import com.MiguelBarroso.courseSpring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> categoryOptional = repository.findById(id);
        return categoryOptional.get();
    }
}
