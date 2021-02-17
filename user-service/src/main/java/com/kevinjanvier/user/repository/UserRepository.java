package com.kevinjanvier.user.repository;

import com.kevinjanvier.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User , Long> {
    User findByUserId(Long userId);
}
