package com.MiguelBarroso.courseSpring.servicies;

import com.MiguelBarroso.courseSpring.entities.User;
import com.MiguelBarroso.courseSpring.repositories.UserRepository;
import com.MiguelBarroso.courseSpring.servicies.exception.DatabaseException;
import com.MiguelBarroso.courseSpring.servicies.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> userOptional = repository.findById(id);
        return userOptional.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user) {
        return repository.save(user);
    }

    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException(id);
        }
        try {
            repository.deleteById(id);

        } catch (DataIntegrityViolationException e) {

            throw new DatabaseException(e.getMessage());
        }

    }

    public User update(Long id, User user) {
        User entity = repository.getReferenceById(id);
        updateData(entity, user);
        return repository.save(entity);
    }

    private void updateData(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
    }
}
