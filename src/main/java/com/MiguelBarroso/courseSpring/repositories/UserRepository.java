package com.MiguelBarroso.courseSpring.repositories;

import com.MiguelBarroso.courseSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
