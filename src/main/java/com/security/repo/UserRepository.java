package com.security.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String name);

}
