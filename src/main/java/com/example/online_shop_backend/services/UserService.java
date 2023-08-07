package com.example.online_shop_backend.services;

import com.example.online_shop_backend.entites.Users;
import com.example.online_shop_backend.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    public UsersRepository usersRepository;
    @Autowired
    public UserService (UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }
    public Users addUser(Users users){
         return usersRepository.save(users);
    }

    public List<Users> getUserList(){
        return usersRepository.findAll();
    }
}
