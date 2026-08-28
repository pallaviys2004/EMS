package com.spring.EMS.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.EMS.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
           Optional<User> findByEmail(String email);
}
