package com.example.JWTAuthenticationSpringboot.services;

import com.example.JWTAuthenticationSpringboot.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User>store=new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"kaven",
                "kaven45cr7@gmail.com"));
        
    }

    public List<User>getUsers(){
        return this.store;
    }
}
