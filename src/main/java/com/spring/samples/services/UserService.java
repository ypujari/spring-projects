package com.spring.samples.services;

import com.spring.samples.brokers.UserBroker;
import com.spring.samples.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired private UserBroker userBroker;

    public Collection<User> getAllUsers(){
        return userBroker.getAllUsers();
    }
}
