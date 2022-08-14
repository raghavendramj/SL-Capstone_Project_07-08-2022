package com.simpliearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simpliearn.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
