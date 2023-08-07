package com.example.online_shop_backend.repositories;

import com.example.online_shop_backend.entites.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
    
}