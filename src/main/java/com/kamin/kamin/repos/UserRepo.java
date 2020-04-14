package com.kamin.kamin.repos;

import com.kamin.kamin.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);




}
