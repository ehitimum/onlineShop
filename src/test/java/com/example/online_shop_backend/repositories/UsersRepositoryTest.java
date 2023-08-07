package com.example.online_shop_backend.repositories;

import com.example.online_shop_backend.entites.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UsersRepositoryTest {
    @Autowired
    private UsersRepository usersRepository;
    @Test
    public void saveUser(){
        Users users = Users.builder()
                .emailAddress("shabbir@gmail.com")
                .firstName("Shabbir")
                .lastName("Dawoodi")
                .build();

        usersRepository.save(users);
    }

}