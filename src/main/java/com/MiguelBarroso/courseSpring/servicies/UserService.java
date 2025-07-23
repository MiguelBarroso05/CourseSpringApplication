package com.MiguelBarroso.courseSpring.servicies;

import com.MiguelBarroso.courseSpring.entities.User;
import com.MiguelBarroso.courseSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
     return repository.findAll();
    }
    public User findById(Long id){
        Optional<User> userOptional = repository.findById(id);
        return userOptional.get();
    }
}
