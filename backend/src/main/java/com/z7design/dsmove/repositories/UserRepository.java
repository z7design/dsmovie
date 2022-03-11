package com.z7design.dsmove.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.z7design.dsmove.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
